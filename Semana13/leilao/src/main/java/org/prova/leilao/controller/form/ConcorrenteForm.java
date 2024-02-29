package org.prova.leilao.controller.form;

import org.prova.leilao.module.Concorrente;
import org.prova.leilao.module.Lance;

import java.util.ArrayList;
import java.util.List;

public class ConcorrenteForm {
    private String nome;
    private String cpf;
    private List<Lance> lances = new ArrayList<Lance>();

    public ConcorrenteForm() {
    }

    public ConcorrenteForm(String nome, String cpf, List<Lance>lances) {
        this.nome = nome;
        this.cpf = cpf;
        this.lances = lances;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Concorrente criarConcorrente(){
        return new Concorrente(null, nome, cpf, lances);}
}
