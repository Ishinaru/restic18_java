package com.controleaeroporto.aeroporto.controller.forms;

import com.controleaeroporto.aeroporto.modelo.Aeroporto;

public class AeroportosForm {
    private String ICAO;
    private String Nome;
    public AeroportosForm() {
    }

    public AeroportosForm(String ICAO, String nome) {
        this.ICAO = ICAO;
        Nome = nome;
    }

    public String getICAO() {
        return ICAO;
    }

    public void setICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
    public Aeroporto criarAeroporto(){ return new Aeroporto( Nome, ICAO);}
}
