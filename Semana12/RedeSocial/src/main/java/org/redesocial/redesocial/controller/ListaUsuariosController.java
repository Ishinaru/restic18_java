package org.redesocial.redesocial.controller;

import org.redesocial.redesocial.controller.dto.UsuarioDTO;
import org.redesocial.redesocial.modelo.Usuario;
import org.redesocial.redesocial.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListaUsuariosController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping("/usuarios/")
    public List<UsuarioDTO> listaUsuarios(String name){
        List<Usuario> listaUsuarios;
        if(name == null)
            listaUsuarios = (ArrayList<Usuario>) usuarioRepository.findByNome(name);
        else listaUsuarios = (ArrayList<Usuario>) usuarioRepository.findAll();
        List<UsuarioDTO> listaUsuariosDTO = new ArrayList<UsuarioDTO>();

        for(Usuario user: listaUsuarios){
            UsuarioDTO ud = new UsuarioDTO(user);
            listaUsuariosDTO.add(ud);
        }
        return listaUsuariosDTO;
    }

    @GetMapping("/usuarios")
    public List<UsuarioDTO> listaUsuarios(){
        List<Usuario> listaUsuarios = (ArrayList<Usuario>) usuarioRepository.findAll();
        List<UsuarioDTO> listaUsuariosDTO = new ArrayList<UsuarioDTO>();
        for(Usuario user: listaUsuarios){
            UsuarioDTO ud = new UsuarioDTO(user);
            listaUsuariosDTO.add(ud);
        }
        return listaUsuariosDTO;
    }
}
