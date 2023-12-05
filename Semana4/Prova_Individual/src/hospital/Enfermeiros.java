package hospital;

import java.util.Date;

public class Enfermeiros extends  Pessoa{
    int enfermeiroId;
    public Enfermeiros(String nome, String cpf, Endereco endereco, String telefone, Date data_nascimento) {
        super(nome, cpf, endereco, telefone, data_nascimento);
        this.enfermeiroId+=1;
    }

    public int getEnfermeiroId() {
        return enfermeiroId;
    }
}
