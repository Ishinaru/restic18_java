package org.redesocial.redesocial.controller;

import org.redesocial.redesocial.controller.dto.UsuarioDTO;
import org.redesocial.redesocial.controller.form.UsuarioForm;
import org.redesocial.redesocial.modelo.Usuario;
import org.redesocial.redesocial.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public void inserir(@RequestBody UsuarioForm usuarioForm){
        Usuario usuario = usuarioForm.criarUsuario();
        usuarioRepository.save(usuario);
    }

}
