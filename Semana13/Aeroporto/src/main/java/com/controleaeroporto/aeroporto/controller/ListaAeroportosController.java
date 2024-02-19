package com.controleaeroporto.aeroporto.controller;

import com.controleaeroporto.aeroporto.modelo.Aeroporto;
import com.controleaeroporto.aeroporto.repository.AeroportoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListaAeroportosController {
    private AeroportoRepository aeroportoRepository;
    @RequestMapping("/listaaeroporto")
    public List<Aeroporto>listaAeroportos(){
        return (ArrayList<Aeroporto>) aeroportoRepository.findAll();
    }
}
