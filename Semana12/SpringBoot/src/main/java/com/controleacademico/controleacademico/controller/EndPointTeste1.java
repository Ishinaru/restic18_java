package com.controleacademico.controleacademico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class EndPointTeste1 {
    @RequestMapping("/teste1")
    @ResponseBody
    public String mensagem(){
        return "Teste 1";
    }
}
