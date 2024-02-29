package org.prova.leilao.module;

public class Concorrente {
    private Long id;
    private String nome;
    private String cpf;

    public Concorrente() {}

    public Concorrente(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
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

    public String toString() {
        return  "Concorrente nº " + id + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n";
    }

    public void mostrarConcorrente(){
        System.out.println(toString());
    }
}
