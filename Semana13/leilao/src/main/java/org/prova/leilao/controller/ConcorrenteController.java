package org.prova.leilao.controller;

import org.prova.leilao.controller.dto.ConcorrenteDTO;
import org.prova.leilao.controller.dto.LanceDTO;
import org.prova.leilao.module.Concorrente;
import org.prova.leilao.module.Lance;
import org.prova.leilao.repository.ConcorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
