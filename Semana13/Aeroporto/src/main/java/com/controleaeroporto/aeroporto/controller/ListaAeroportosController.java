package com.controleaeroporto.aeroporto.controller;

import com.controleaeroporto.aeroporto.modelo.Aeroporto;
import com.controleaeroporto.aeroporto.repository.AeroportoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListaAeroportosController {
    @Autowired
    private AeroportoRepository aeroportoRepository;
    @RequestMapping("/listaaeroporto")
    public List<Aeroporto>listaAeroportos(){
        return (<Aeroporto>) aeroportoRepository.findAll();
    }
}
