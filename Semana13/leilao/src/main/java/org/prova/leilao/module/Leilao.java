package org.prova.leilao.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valorMaximo;
    private boolean aberto;
    public Leilao() {
    }
    public Leilao(Long id, String descricao, Double valorMaximo) {
        this.id = id;
        this.descricao = descricao;
        this.valorMaximo = valorMaximo;
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

    public String toString(){
        if(this.aberto)
            return "Leilão nº "+id+"\n" +
                    "Descrição: "+descricao+"\n"+
                    "Valor Máximo: "+valorMaximo+"\n" +
                    "Status: Aberto";
        else
            return "Leilão nº "+id+"\n" +
                    "Descrição: "+descricao+"\n"+
                    "Valor Máximo: "+valorMaximo+"\n" +
                    "Status: Fechado";
    }
    public void mostrarLeilao(){
        System.out.println(toString());
    }
}
