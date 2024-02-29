package org.prova.leilao.module;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Concorrente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    @OneToMany(mappedBy = "lanceAssociedado")
    private List<Lance>lances = new ArrayList<>();

    public Concorrente() {}

    public Concorrente(Long id, String nome, String cpf, List<Lance>lances) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.lances = lances;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Lance> getLances() {
        return lances;
    }

    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }

    public String toString() {
        return  "Concorrente nº " + id + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n"+
                "Lances: "+lances;
    }

    public void mostrarConcorrente(){
        System.out.println(toString());
    }
}
