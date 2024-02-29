package org.prova.leilao.controller;

import org.prova.leilao.controller.dto.LeilaoDTO;
import org.prova.leilao.module.Leilao;
import org.prova.leilao.repository.LeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
