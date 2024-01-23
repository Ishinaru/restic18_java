package hospital;

import java.util.ArrayList;

class Atendimento {
    private Medicos medicos;
    private Pacientes paciente;
    private String tipoAtendimento;
    private boolean urgencia;
    private Procedimento procedimentos;

    public Atendimento(Medicos medico, Pacientes paciente, String tipoAtendimento, boolean urgencia, Procedimento procedimento) {
        this.medicos = medico;
        this.paciente = paciente;
        this.tipoAtendimento = tipoAtendimento;
        this.urgencia = urgencia;
        this.procedimentos = procedimento;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public void setMedicos(Medicos medicos) {
        this.medicos = medicos;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public Procedimento getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(Procedimento procedimentos) {
        this.procedimentos = procedimentos;
    }
}
