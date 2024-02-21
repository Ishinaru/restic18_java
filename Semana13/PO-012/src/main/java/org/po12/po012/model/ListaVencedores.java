package org.po12.po012.model;

import javax.annotation.processing.Generated;

public class ListaVencedores {
    private String Pais;
    private String Nome;
    private int Vitorias;

    public ListaVencedores() {
    }
    public ListaVencedores(String pais, String nome, int vitorias) {
        Pais = pais;
        Nome = nome;
        Vitorias = vitorias;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getVitorias() {
        return Vitorias;
    }

    public void setVitorias(int vitorias) {
        Vitorias = vitorias;
    }
}
