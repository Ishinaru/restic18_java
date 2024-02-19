package org.redesocial.redesocial.controller;

import org.redesocial.redesocial.gerenciarchaves.Key;
import org.redesocial.redesocial.gerenciarchaves.RSAGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSAController {
    @RequestMapping("/gerarchavesrsa")
    public String retornaKey(){
        RSAGenerator chave = new RSAGenerator(32);
        String chavePublica = chave.getPublickey().toString();
        String chavePrivate = chave.getPrivatekey().toString();
        return chavePublica +"\n" +chavePrivate;
    }
}
