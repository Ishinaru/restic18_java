package org.prova.leilao.controller;

import org.prova.leilao.controller.dto.LanceDTO;
import org.prova.leilao.module.Lance;
import org.prova.leilao.repository.LanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lance/")
public class LanceController {
    @Autowired
    private LanceRepository lanceRepository;
    @GetMapping
    public List<LanceDTO> retornaLance(){
        List<Lance>listaLance = (ArrayList<Lance>)lanceRepository.findAll();
        List<LanceDTO> listaLanceDTO = new ArrayList<LanceDTO>();
        for (Lance lance: listaLance){
            LanceDTO lanceDTO = new LanceDTO(lance);
            listaLanceDTO.add(lanceDTO);
        }
        return listaLanceDTO;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> retornaLanceId(@PathVariable Long id){
        if (id != null) {
            try {
                Lance lance = lanceRepository.getReferenceById(id);
                LanceDTO lanceDTO = new LanceDTO(lance);
                return ResponseEntity.ok(lanceDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        else
            return ResponseEntity.badRequest().build();
    }

    @GetMapping("/leilao={id}")
    public ResponseEntity<?> retornaLeilaoId(@PathVariable Long id){
        if (id != null) {
            try {
                Lance lance = lanceRepository.findByLeilaoAssociado(id);
                LanceDTO lanceDTO = new LanceDTO(lance);
                return ResponseEntity.ok(lanceDTO);
            } catch (Exception e) {
                return ResponseEntity.notFound().build();
            }
        }
        else
            return ResponseEntity.badRequest().build();
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

}

