package org.prova.leilao.controller.dto;

import org.prova.leilao.module.Concorrente;

public class ConcorrenteDTO {
    private String nome;

    public ConcorrenteDTO() {}

    public ConcorrenteDTO(Concorrente concorrente) {
        this.nome = concorrente.getNome();
    }

    public String getNome() {
        return nome;
    }
}
