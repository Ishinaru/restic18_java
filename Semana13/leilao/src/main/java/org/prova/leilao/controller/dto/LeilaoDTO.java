package org.prova.leilao.controller.dto;

import org.prova.leilao.module.Lance;
import org.prova.leilao.module.Leilao;

import java.util.ArrayList;
import java.util.List;

public class LeilaoDTO {
    private Long id;
    private String descricao;
    private Double valorMinimo;
    private boolean status;
    private List<Lance> lances = new ArrayList<Lance>();

    public LeilaoDTO() {
    }

    public LeilaoDTO(Leilao leilao) {
        this.id = leilao.getId();
        this.descricao = leilao.getDescricao();
        this.valorMinimo = leilao.getValorMinimo();
        this.status = leilao.isAberto();
        this.lances = leilao.getLances();
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public String getStatus(){
        if (status)
            return "Aberto";
        else
            return "Fechado";
    }

    public List<Lance> getLances() {
        return lances;
    }
}
