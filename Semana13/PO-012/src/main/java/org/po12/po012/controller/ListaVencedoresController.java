package org.po12.po012.controller;

import org.po12.po012.model.ListaVencedores;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaVencedoresController {
    @RequestMapping("/todos")
    public List<ListaVencedores>listarVencedores(){


    }
}
