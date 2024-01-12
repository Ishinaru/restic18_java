package po_06.exercicio4;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome = "+ nome + ", CPF = " + cpf;
    }

    public void printPessoa(){
        System.out.println(this.toString());
    }
}

