package org.prova.leilao.controller;

import org.prova.leilao.controller.dto.LanceDTO;
import org.prova.leilao.controller.dto.LeilaoDTO;
import org.prova.leilao.module.Lance;
import org.prova.leilao.module.Leilao;
import org.prova.leilao.repository.LanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lance/")
public class LanceController {
    @Autowired
    private LanceRepository lanceRepository;
    @GetMapping
    public List<LanceDTO> retornaLeilao(){
        List<Lance>listaLance = (ArrayList<Lance>)lanceRepository.findAll();
        List<LanceDTO> listaLanceDTO = new ArrayList<LanceDTO>();
        for (Lance lance: listaLance){
            LanceDTO lanceDTO = new LanceDTO(lance);
            listaLanceDTO.add(lanceDTO);
        }
        return listaLanceDTO;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> retornaLeilaoId(@PathVariable Long id){
        if (id != null) {
            try {
                Lance lance = lanceRepository.getReferenceById(id);
                LanceDTO lanceDTO = new LanceDTO(lance);
                return ResponseEntity.ok(lanceDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        else
            return ResponseEntity.badRequest().build();
    }


}

