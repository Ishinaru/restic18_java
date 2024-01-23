package hospital;

import java.util.Date;

public class Pessoa {

    private String nome, cpf, telefone;
    private Endereco endereco;
    private Date data_nascimento;
    public Pessoa(String nome, String cpf, Endereco endereco, String telefone, Date data_nascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.telefone = telefone;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco=" + endereco +
                ", data_nascimento=" + data_nascimento +
                '}';
    }
}
