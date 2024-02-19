package com.controleaeroporto.aeroporto.controller;

import com.controleaeroporto.aeroporto.modelo.ModeloAeronave;
import com.controleaeroporto.aeroporto.repository.ModeloAeronaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ModelosAeronavesController {
    @Autowired
    private ModeloAeronaveRepository modeloAeronaveRepository;
    @RequestMapping("/listamodeloaeronave")
    public List<ModeloAeronave> listaModeloAeronave(){
        return (ArrayList<ModeloAeronave>) modeloAeronaveRepository.findAll();
    }
}
