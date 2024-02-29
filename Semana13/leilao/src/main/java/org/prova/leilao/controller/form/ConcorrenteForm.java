package org.prova.leilao.controller.form;

import org.prova.leilao.module.Concorrente;

public class ConcorrenteForm {
    private String nome;
    private String cpf;

    public ConcorrenteForm() {
    }

    public ConcorrenteForm(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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
        return new Concorrente(null, nome, cpf);}
}
