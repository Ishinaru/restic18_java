package org.prova.leilao.controller.form;

import org.prova.leilao.module.Leilao;

public class LeilaoForm {
    private String descricao;
    private Double valorMaximo;
    private boolean aberto;

    public LeilaoForm() {
    }

    public LeilaoForm(String descricao, Double valorMaximo, boolean aberto) {
        this.descricao = descricao;
        this.valorMaximo = valorMaximo;
        this.aberto = aberto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(Double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Leilao criarLeilao(){return new Leilao(null, descricao, valorMaximo);}
}
