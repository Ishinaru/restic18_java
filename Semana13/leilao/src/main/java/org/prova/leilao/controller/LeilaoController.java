package org.prova.leilao.controller;

import org.prova.leilao.controller.dto.ConcorrenteDTO;
import org.prova.leilao.controller.dto.LeilaoDTO;
import org.prova.leilao.controller.form.LeilaoForm;
import org.prova.leilao.module.Concorrente;
import org.prova.leilao.module.Leilao;
import org.prova.leilao.repository.LeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/leilao/")
public class LeilaoController {
    @Autowired
    private LeilaoRepository leilaoRepository;
    @GetMapping
    public List<LeilaoDTO> retornaLeilao(){
        List<Leilao>listaLeilao = (ArrayList<Leilao>)leilaoRepository.findAll();
        List<LeilaoDTO> listaLeilaoDTO = new ArrayList<LeilaoDTO>();
        for (Leilao leilao: listaLeilao){
            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
            listaLeilaoDTO.add(leilaoDTO);
        }
        return listaLeilaoDTO;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> retornaLeilaoID(@PathVariable Long id){
        if (id != null) {
            try {
                Leilao leilao = leilaoRepository.getReferenceById(id);
                LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
                return ResponseEntity.ok(leilaoDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        else
            return ResponseEntity.badRequest().build();
    }
    @PostMapping("/{id}")
    public ResponseEntity<?> inserirLeilao(@RequestBody LeilaoForm leilaoForm , UriComponentsBuilder uriBuilder){
        try{
            Leilao leilao = leilaoForm.criarLeilao();
            leilaoRepository.save(leilao);
            LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
            uriBuilder.path("/leilao/{id}");
            URI uri = uriBuilder.buildAndExpand(leilao.getId()).toUri();
            return ResponseEntity.created(uri).body(leilaoDTO);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>updtadeLeilaoId(@RequestBody LeilaoForm leilaoForm, @PathVariable Long id){
        if(id!=null) {
            try {
                Leilao leilao = leilaoRepository.getReferenceById(id);
                leilao.setDescricao(leilao.getDescricao());
                leilao.setValorMaximo(leilao.getValorMaximo());
                leilao.setAberto(leilao.isAberto());
                leilaoRepository.save(leilao);
                LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
                return ResponseEntity.ok(leilaoDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?>deleteLeilao(@PathVariable Long id){
        if(id!=null) {
            try {
                Leilao leilao = leilaoRepository.getReferenceById(id);
                LeilaoDTO leilaoDTO = new LeilaoDTO(leilao);
                leilaoRepository.delete(leilao);
                System.out.println("Leilão "+leilaoDTO.getDescricao()+" Deletado!!!!");
                return ResponseEntity.ok(leilaoDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }

}
