package hospital;

class Triagem {
    private Enfermeiros enfermeiro;
    private Pacientes paciente;
    private Atendimento tipoAtendimento;

    public Enfermeiros getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiros enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public Atendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(Atendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public Triagem(Enfermeiros enfermeiro, Pacientes paciente, Atendimento tipoAtendimento) {
        this.enfermeiro = enfermeiro;
        this.paciente = paciente;
        this.tipoAtendimento = tipoAtendimento;
    }
}
