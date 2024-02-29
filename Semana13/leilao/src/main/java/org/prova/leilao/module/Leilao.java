package org.prova.leilao.module;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valorMaximo;
    private boolean aberto;
    @OneToMany(mappedBy = "lanceAssociado")
    private List<Lance> lances = new ArrayList<>();
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

    public void abrirLeilao() {
        this.aberto = true;
    }

    public void fecharLeilao() {
        this.aberto = false;
    }
    public void addLance(Lance lance) {
        this.lances.add(lance);
        lance.setLeilaoAssociado(this);
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
