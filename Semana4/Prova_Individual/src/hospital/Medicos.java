package hospital;

import java.util.Date;

public class Medicos extends Pessoa{

    String especialidade;
    public Medicos(String nome, String cpf, Endereco endereco, String telefone, Date data_nascimento, String especialidade) {
        super(nome, cpf, endereco, telefone, data_nascimento);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
