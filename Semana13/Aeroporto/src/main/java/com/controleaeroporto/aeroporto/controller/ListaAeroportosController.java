package com.controleaeroporto.aeroporto.controller;

import com.controleaeroporto.aeroporto.modelo.Aeroporto;
import com.controleaeroporto.aeroporto.repository.AeroportoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListaAeroportosController {
    @Autowired
    private AeroportoRepository aeroportoRepository;
    @RequestMapping("/listaaeroporto")
    public List<Aeroporto>listaAeroportos(){
<<<<<<< HEAD
        return (<Aeroporto>) aeroportoRepository.findAll();
=======
        return aeroportoRepository.findAll();
>>>>>>> ad985cd0e139b8d4212254fa669fb49a684b3632
    }
}
