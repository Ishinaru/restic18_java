package org.redesocial.redesocial.controller;

import org.redesocial.redesocial.controller.dto.UsuarioDTO;
import org.redesocial.redesocial.controller.form.UsuarioForm;
import org.redesocial.redesocial.modelo.Usuario;
import org.redesocial.redesocial.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
/*
@RestController
public class ListaUsuariosController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @PostMapping
    public ResponseEntity<UsuarioDTO>inserir(@RequestBody UsuarioForm Uf, UriComponentsBuilder Ub){
        Usuario usuario = Uf.criarUsuario();
        usuarioRepository.save(usuario);
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario);
        Ub.path("/usuarios/{id}");
        URI uri = Ub.buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioDTO);
    }
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

    @GetMapping("/{id}")
    public UsuarioDTO listaUsuarios(@PathVariable Long id){
        Usuario usuario = usuarioRepository.getReferenceById(id);
        return new UsuarioDTO(usuario);
    }

}
*/