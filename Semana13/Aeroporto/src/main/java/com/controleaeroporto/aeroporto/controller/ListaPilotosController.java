package com.controleaeroporto.aeroporto.controller;

import com.controleaeroporto.aeroporto.modelo.Piloto;
import com.controleaeroporto.aeroporto.repository.PilotoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListaPilotosController {
    private PilotoRepository pilotoRepository;
    @RequestMapping("/listapilotos")
    public List<Piloto> listaPilotos(){
        return (ArrayList<Piloto>) pilotoRepository.findAll();
    }
}
