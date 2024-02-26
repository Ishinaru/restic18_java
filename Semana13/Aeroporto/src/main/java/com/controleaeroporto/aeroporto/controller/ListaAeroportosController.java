package com.controleaeroporto.aeroporto.controller;

import com.controleaeroporto.aeroporto.controller.forms.AeroportosForm;
import com.controleaeroporto.aeroporto.modelo.Aeroporto;
import com.controleaeroporto.aeroporto.repository.AeroportoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class ListaAeroportosController {
    @Autowired
    private AeroportoRepository aeroportoRepository;
    @RequestMapping("/listaaeroporto")
    public List<Aeroporto>listaAeroportos(){
        return aeroportoRepository.findAll();
    }
    @PostMapping("/{aeroportos}")
    public RequestEntity<?>inserirAeroporto(@RequestBody UriComponentsBuilder uriBuilder, AeroportosForm af){
        Aeroporto aeroporto = af.criarAeroporto();
        aeroportoRepository.save(aeroporto);
        AeroportoDTO aeroportoDTO = AeroportoDTO(aeroporto);
        uriBuilder.path("/aeroporto/{id}");
        URI uri = uriBuilder.buildAndExpand(aeroporto.getId()).toUri();
        return ResponseEntity.created(uri).body(aeroportoDTO);
    }

}
