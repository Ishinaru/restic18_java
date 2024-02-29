package org.prova.leilao.controller.dto;

import jakarta.persistence.ManyToOne;
import org.prova.leilao.module.Concorrente;
import org.prova.leilao.module.Lance;
import org.prova.leilao.module.Leilao;

public class LanceDTO {
    private Leilao leilaoAssociado;
    private Concorrente concorrenteAssociado;
    private Double valor;

    public LanceDTO() {
    }

    public LanceDTO(Lance lance) {
        this.leilaoAssociado = lance.getLeilaoAssociado();
        this.concorrenteAssociado = lance.getConcorrenteAssociado();
        this.valor = lance.getValor();
    }

    public Leilao getLeilaoAssociado() {
        return leilaoAssociado;
    }

    public Concorrente getConcorrenteAssociado() {
        return concorrenteAssociado;
    }

    public Double getValor() {
        return valor;
    }
}
