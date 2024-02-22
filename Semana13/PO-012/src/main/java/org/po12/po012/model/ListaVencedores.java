package org.po12.po012.model;

public class ListaVencedores {
    private String Pais;
    private String Nome;
    private int Vitorias;

    public ListaVencedores() {
    }
    public ListaVencedores(String pais, String nome, int vitorias) {
        this.Pais = pais;
        this.Nome = nome;
        this.Vitorias = vitorias;
    }

    public String getPais() {
        return Pais;
    }
    public String getNome() {
        return Nome;
    }

    public int getVitorias() {
        return Vitorias;
    }

}
