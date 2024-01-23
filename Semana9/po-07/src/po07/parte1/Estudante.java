package po07.parte1;

public class Estudante {
    private String nome;
    private String cpf;
    private float CRA;
    private int anoDeAdmissao;

    public Estudante(){}
    public Estudante(String nome, String cpf, float CRA, int anoDeAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.CRA = CRA;
        this.anoDeAdmissao = anoDeAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float getCRA() {
        return CRA;
    }

    public int getAnoDeAdmissao() {
        return anoDeAdmissao;
    }
}
