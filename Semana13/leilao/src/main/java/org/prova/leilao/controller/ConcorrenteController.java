package org.prova.leilao.controller;

import org.prova.leilao.controller.dto.ConcorrenteDTO;
import org.prova.leilao.controller.form.ConcorrenteForm;
import org.prova.leilao.module.Concorrente;
import org.prova.leilao.repository.ConcorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/concorrente/")
public class ConcorrenteController {
    @Autowired
    private ConcorrenteRepository concorrenteRepository;
    @GetMapping
    public List<ConcorrenteDTO> retornaConcorrente(){
        List<Concorrente>listaConcorrente = (ArrayList<Concorrente>)concorrenteRepository.findAll();
        List<ConcorrenteDTO> listaConcorrenteDTO = new ArrayList<ConcorrenteDTO>();
        for(Concorrente concorrente : listaConcorrente){
            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
            listaConcorrenteDTO.add(concorrenteDTO);
        }
        return listaConcorrenteDTO;
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>retornaConcorrenteID(@PathVariable Long id){
        if (id != null) {
            try {
                Concorrente concorrente = concorrenteRepository.getReferenceById(id);
                ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
                return ResponseEntity.ok(concorrenteDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        else
            return ResponseEntity.badRequest().build();
    }
    @PostMapping("/{id}")
    public ResponseEntity<?>inserirConcorrente(@RequestBody ConcorrenteForm concorrenteForm, UriComponentsBuilder uriBuilder){
        try{
            Concorrente concorrente = concorrenteForm.criarConcorrente();
            concorrenteRepository.save(concorrente);
            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
            uriBuilder.path("/concorrente/{id}");
            URI uri = uriBuilder.buildAndExpand(concorrente.getId()).toUri();
            return ResponseEntity.created(uri).body(concorrenteDTO);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>updateConcorrenteId(@RequestBody ConcorrenteForm concorrenteForm, @PathVariable Long id){
        if(id!=null) {
            try {
                Concorrente concorrente = concorrenteRepository.getReferenceById(id);
                concorrente.setNome(concorrenteForm.getNome());
                concorrente.setCpf(concorrenteForm.getCpf());
                concorrenteRepository.save(concorrente);
                ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
                return ResponseEntity.ok(concorrenteDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>deleteConcorrenteId(@RequestBody ConcorrenteForm concorrenteForm, @PathVariable Long id){
        if(id!=null) {
            try {
                Concorrente concorrente = concorrenteRepository.getReferenceById(id);
                ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(concorrente);
                concorrenteRepository.delete(concorrente);
                return ResponseEntity.ok(concorrenteDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }
}
