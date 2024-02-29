package org.prova.leilao.controller.dto;

import org.prova.leilao.module.Concorrente;
import org.prova.leilao.module.Lance;

import java.util.ArrayList;
import java.util.List;

public class ConcorrenteDTO {
    private String nome;
    private List<Lance> lances = new ArrayList<Lance>();

    public ConcorrenteDTO() {}

    public ConcorrenteDTO(Concorrente concorrente) {
        this.nome = concorrente.getNome();
        this.lances = concorrente.getLances();
    }

    public String getNome() {
        return nome;
    }

    public List<Lance> getLances() {
        return lances;
    }
}
