package org.redesocial.redesocial.controller;

import org.redesocial.redesocial.controller.dto.UsuarioDTO;
import org.redesocial.redesocial.modelo.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsuarioController {
    @RequestMapping("/listausuarios")
    public ArrayList<UsuarioDTO> listaUsuarios(){
        ArrayList<UsuarioDTO> lista = new ArrayList<>();
        lista.add(new UsuarioDTO(new Usuario((long)1,"David", "david@gmail.com", "senha1234567890")));

        lista.add(new UsuarioDTO(new Usuario((long)2,"Dora", "dora123@gmail.com", "senhateste")));
        lista.add(new UsuarioDTO(new Usuario((long)3,"Ana", "anana@gmail.com", "senhateste")));
        lista.add(new UsuarioDTO(new Usuario((long)0,"Kainê", "kainelinda@gmail.com", "senhateste")));
        return lista;
    }
}
