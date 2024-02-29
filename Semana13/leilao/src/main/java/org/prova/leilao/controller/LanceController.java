package org.prova.leilao.controller;

import org.prova.leilao.controller.dto.ConcorrenteDTO;
import org.prova.leilao.controller.dto.LanceDTO;
import org.prova.leilao.controller.dto.LeilaoDTO;
import org.prova.leilao.controller.form.LanceForm;
import org.prova.leilao.controller.form.LeilaoForm;
import org.prova.leilao.module.Concorrente;
import org.prova.leilao.module.Lance;
import org.prova.leilao.module.Leilao;
import org.prova.leilao.repository.LanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lance/")
public class LanceController {
    @Autowired
    private LanceRepository lanceRepository;
    @GetMapping
    public List<LanceDTO> retornaLance(){
        List<Lance>listaLance = (ArrayList<Lance>)lanceRepository.findAll();
        List<LanceDTO> listaLanceDTO = new ArrayList<LanceDTO>();
        for (Lance lance: listaLance){
            LanceDTO lanceDTO = new LanceDTO(lance);
            listaLanceDTO.add(lanceDTO);
        }
        return listaLanceDTO;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> retornaLanceId(@PathVariable Long id){
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

    @GetMapping("/leilao={id}")
    public ResponseEntity<?> retornaLeilaoId(@PathVariable Long id){
        if (id != null) {
            try {
                List<Lance> listaLance = (ArrayList<Lance>)lanceRepository.findByLeilaoAssociado(id);
                LeilaoDTO listaLeilao;
                List<LeilaoDTO> listaLeiloesDTO = new ArrayList<LeilaoDTO>();
                for (Lance lance: listaLance){
                    listaLeilao = new LeilaoDTO(lance.getLeilaoAssociado());
                    listaLeiloesDTO.add(listaLeilao);
                }
                return ResponseEntity.ok(listaLeiloesDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        else
            return ResponseEntity.badRequest().build();
    }

    @GetMapping("/concorrente={id}")
    public ResponseEntity<?> retornaConcorrenteId(@PathVariable Long id){
        if (id != null) {
            try {
                List<Lance> listaLance = (ArrayList<Lance>)lanceRepository.findByConcorrenteAssociado(id);
                ConcorrenteDTO listaCorrente;
                List<ConcorrenteDTO> listaLeiloesDTO = new ArrayList<ConcorrenteDTO>();
                for (Lance lance: listaLance){
                    listaCorrente = new ConcorrenteDTO(lance.getConcorrenteAssociado());
                    listaLeiloesDTO.add(listaCorrente);
                }
                return ResponseEntity.ok(listaLeiloesDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        else
            return ResponseEntity.badRequest().build();
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> inserirLance(@RequestBody LanceForm lanceForm, UriComponentsBuilder uriBuilder){
        try{
            Lance lance = lanceForm.criarLance();
            lanceRepository.save(lance);
            LanceDTO lanceDTO = new LanceDTO(lance);
            uriBuilder.path("/lance/{id}");
            URI uri = uriBuilder.buildAndExpand(lance.getId()).toUri();
            if (lance.getLeilaoAssociado()==null)
                return ResponseEntity.badRequest().build();
            else if(!lance.getLeilaoAssociado().isAberto())
                return ResponseEntity.badRequest().build();

            return ResponseEntity.created(uri).body(leilaoDTO);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }


}

