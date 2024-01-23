package hospital;

import java.util.ArrayList;

class Procedimento {
    String nome;
    String descricao;
    ArrayList<Medicos> medicos;
    ArrayList<Enfermeiros> enfermeiros;
    ArrayList<String> medicamentos;
    ArrayList<String> insumos;
    ArrayList<Procedimento> procedimentosAssociados;

    public Procedimento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.medicos = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
        this.procedimentosAssociados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Medicos> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medicos> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Enfermeiros> getEnfermeiros() {
        return enfermeiros;
    }

    public void setEnfermeiros(ArrayList<Enfermeiros> enfermeiros) {
        this.enfermeiros = enfermeiros;
    }

    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public ArrayList<String> getInsumos() {
        return insumos;
    }

    public void setInsumos(ArrayList<String> insumos) {
        this.insumos = insumos;
    }

    public ArrayList<Procedimento> getProcedimentosAssociados() {
        return procedimentosAssociados;
    }

    public void setProcedimentosAssociados(ArrayList<Procedimento> procedimentosAssociados) {
        this.procedimentosAssociados = procedimentosAssociados;
    }
}

