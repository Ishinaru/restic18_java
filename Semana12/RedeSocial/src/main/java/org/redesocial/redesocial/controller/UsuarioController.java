package org.redesocial.redesocial.controller;

import org.antlr.v4.runtime.misc.LogManager;
import org.redesocial.redesocial.controller.dto.UsuarioDTO;
import org.redesocial.redesocial.controller.form.UsuarioForm;
import org.redesocial.redesocial.modelo.Usuario;
import org.redesocial.redesocial.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public ResponseEntity<UsuarioDTO>inserir(@RequestBody UsuarioForm uf, UriComponentsBuilder ub){
        Usuario usuario = uf.criarUsuario();
        usuarioRepository.save(usuario);
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario);
        ub.path("/usuarios/{id}");
        URI uri = ub.buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarioDTO);
    }

    @GetMapping
    public List<UsuarioDTO> retornaUsuarios(String name){
        List<Usuario>listaUsuarios = (ArrayList<Usuario>) usuarioRepository.findAll();
        List<UsuarioDTO> listaUsuariosDTO = new ArrayList<UsuarioDTO>();
        for (Usuario user: listaUsuarios){
            UsuarioDTO userDTO = new UsuarioDTO(user);
            listaUsuariosDTO.add(userDTO);
        }
        return listaUsuariosDTO;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?>listaUsuariosId(@PathVariable Long id) {
        try {
            Usuario usuario = usuarioRepository.getReferenceById(id);
            UsuarioDTO usuarioDTO = new UsuarioDTO(usuario);
            return ResponseEntity.ok(usuarioDTO);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<?>updateUsuariosId(@RequestBody UsuarioForm uf, @PathVariable Long id){
        if(id!=null) {
            try {

                Usuario usuario = usuarioRepository.getReferenceById(id);
                usuario.setNome(uf.getNome());
                usuario.setEmail(uf.getEmail());
                usuario.setSenha(uf.getSenha());
                usuarioRepository.save(usuario);
                UsuarioDTO usuarioDTO = new UsuarioDTO(usuario);
                return ResponseEntity.ok(usuarioDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>deleteUsuariosDelete(@RequestBody UsuarioForm uf, @PathVariable Long id){
        if(id != null){
            try{
                Usuario usuario = usuarioRepository.getReferenceById(id);
                UsuarioDTO usuarioDTO = new UsuarioDTO(usuario);
                usuarioRepository.delete(usuario);
                System.out.println(usuarioDTO.getNome());
                return ResponseEntity.ok(usuarioDTO);
            }
            catch (Exception e){
                ResponseEntity.notFound().build();
            }
        }
        return ResponseEntity.badRequest().build();
    }
}
