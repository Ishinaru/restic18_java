package org.prova.leilao.controller.dto;

import org.prova.leilao.module.Leilao;

public class LeilaoDTO {
    private Long id;
    private String descricao;
    private Double valorMaximo;
    private boolean status;

    public LeilaoDTO() {
    }

    public LeilaoDTO(Leilao leilao) {
        this.id = leilao.getId();
        this.descricao = leilao.getDescricao();
        this.valorMaximo = leilao.getValorMaximo();
        this.status = leilao.isAberto();
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValorMaximo() {
        return valorMaximo;
    }

    public String getStatus(){
        if (status)
            return "Aberto";
        else
            return "Fechado";
    }

}
