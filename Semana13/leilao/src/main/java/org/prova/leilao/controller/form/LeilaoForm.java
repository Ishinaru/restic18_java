package org.prova.leilao.controller.form;

import org.prova.leilao.module.Lance;
import org.prova.leilao.module.Leilao;

import java.util.ArrayList;
import java.util.List;

public class LeilaoForm {
    private String descricao;
    private Double valorMinimo;
    private boolean aberto;
    private List<Lance> lances = new ArrayList<Lance>();

    public LeilaoForm() {
    }

    public LeilaoForm(String descricao, Double valorMinimo, boolean aberto, List<Lance> lances) {
        this.descricao = descricao;
        this.valorMinimo = valorMinimo;
        this.aberto = aberto;
        this.lances = lances;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }

    public Leilao criarLeilao(){return new Leilao(null, descricao, valorMinimo);}
}
