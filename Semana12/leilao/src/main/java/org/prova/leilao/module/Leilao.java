package org.prova.leilao.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valorMinimo;
    private boolean aberto;

    public Leilao() {
    }

    public Leilao(Long id, String descricao, Double valorMinimo) {
        this.id = id;
        this.descricao = descricao;
        this.valorMinimo = valorMinimo;
        this.aberto = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String toString(){
        if (this.aberto)
            return "Leilão nº "+id+"\n" +
                    "Descrição: "+descricao+"\n" +
                    "Valor Mínimo: "+valorMinimo+"\n"+
                    "Status: Aberto";
        else
            return "Leilão nº "+id+"\n" +
                    "Descrição: "+descricao+"\n" +
                    "Valor Mínimo: "+valorMinimo+"\n"+
                    "Status: Fechado";
    }

    public void mostrarLeilao(){
        System.out.println(toString());
    }
}
