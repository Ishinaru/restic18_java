package hospital;

import java.util.ArrayList;

class Hospital {
    ArrayList<Pacientes> pacientes;
    ArrayList<Enfermeiros> enfermeiros;
    ArrayList<Medicos> medicos;
    ArrayList<String> medicamentos;
    ArrayList<String> insumos;
    ArrayList<Procedimento> procedimentos;

    public Hospital() {
        this.pacientes = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
    }

    public void cadastrarPaciente(Pacientes paciente) {
        pacientes.add(paciente);
    }

    public void cadastrarEnfermeiro(Enfermeiros enfermeiro) {
        enfermeiros.add(enfermeiro);
    }

    public void cadastrarMedico(Medicos medico) {
        medicos.add(medico);
    }

    public void cadastrarMedicamento(String medicamento) {
        medicamentos.add(medicamento);
    }

    public void cadastrarInsumo(String insumo) {
        insumos.add(insumo);
    }

    public void cadastrarProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    public void realizarTriagem(Enfermeiros enfermeiro, Pacientes paciente, Atendimento tipoAtendimento) {
        //Metodo para realizar triagem
    }

    public void realizarAtendimento(Medicos medico, Pacientes paciente, String tipoAtendimento, boolean urgencia) {
        //Metodo para realizar atendimento
    }

    public void realizarProcedimento(Procedimento procedimento, Medicos medico, ArrayList<Enfermeiros> enfermeiros, ArrayList<String> medicamentos, ArrayList<String> insumos) {
        //Metodo para realizar o procedimeto
    }

    public void associarProcedimento(Procedimento procedimentoPai, Procedimento procedimentoFilho) {
        procedimentoPai.procedimentosAssociados.add(procedimentoFilho);
    }
}
