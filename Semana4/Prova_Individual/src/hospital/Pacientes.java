package hospital;

import java.util.ArrayList;
import java.util.Date;

public class Pacientes extends Pessoa{
    private int pacienteID;
    private ArrayList<Triagem>triagens;
    private ArrayList<Atendimento> atendimentos;

    public Pacientes(String nome, String cpf, Endereco endereco, String telefone, Date data_nascimento) {
        super(nome, cpf, endereco, telefone, data_nascimento);
        this.pacienteID +=1;
        this.atendimentos = new ArrayList<Atendimento>();
        this.triagens = new ArrayList<Triagem>();
    }

    public int getpacienteID() {
        return pacienteID;
    }

    public ArrayList<Triagem> getTriagens() {
        return triagens;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
