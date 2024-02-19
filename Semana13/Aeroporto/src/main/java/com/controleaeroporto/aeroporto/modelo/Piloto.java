package com.controleaeroporto.aeroporto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nome;
    private String NumBreve;

    public Piloto() {
    }

    public Piloto(Long id, String nome, String numBreve) {
        Id = id;
        Nome = nome;
        NumBreve = numBreve;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNumBreve() {
        return NumBreve;
    }

    public void setNumBreve(String numBreve) {
        NumBreve = numBreve;
    }
}
