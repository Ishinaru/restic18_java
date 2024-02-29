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
    private Double valorMinimo;
    private boolean aberto;
    @OneToMany(mappedBy = "lanceAssociado")
    private List<Lance> lances = new ArrayList<>();
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

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
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
                    "Valor Máximo: "+valorMinimo+"\n" +
                    "Status: Aberto\n"+
                    "Lances: "+lances;
        else
            return "Leilão nº "+id+"\n" +
                    "Descrição: "+descricao+"\n"+
                    "Valor Máximo: "+valorMinimo+"\n" +
                    "Status: Fechado\n"+
                    "Lances: "+lances;
    }
    public void mostrarLeilao(){
        System.out.println(toString());
    }
}
