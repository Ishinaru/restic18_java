package org.prova.leilao.controller.form;

import org.prova.leilao.module.Concorrente;
import org.prova.leilao.module.Lance;
import org.prova.leilao.module.Leilao;

public class LanceForm {
    private Leilao leilaoAssociado;
    private Concorrente concorrenteAssociado;
    private Double valor;

    public LanceForm() {
    }

    public LanceForm(Leilao leilaoAssociado, Concorrente concorrenteAssociado, Double valor) {
        this.leilaoAssociado = leilaoAssociado;
        this.concorrenteAssociado = concorrenteAssociado;
        this.valor = valor;
    }

    public Leilao getLeilaoAssociado() {
        return leilaoAssociado;
    }

    public void setLeilaoAssociado(Leilao leilaoAssociado) {
        this.leilaoAssociado = leilaoAssociado;
    }

    public Concorrente getConcorrenteAssociado() {
        return concorrenteAssociado;
    }

    public void setConcorrenteAssociado(Concorrente concorrenteAssociado) {
        this.concorrenteAssociado = concorrenteAssociado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Lance criarLance(){return new Lance(null,leilaoAssociado, concorrenteAssociado, valor);}
}
