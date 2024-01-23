package exercicio_veiculo;

import java.util.ArrayList;

public class Veiculo {
    private String modelo, cor;
    private int ano;

    private ArrayList<Veiculo>veiculos = new ArrayList<Veiculo>();

    public Veiculo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.veiculos.add(this);
    }

    public String toString(){
        return "Modelo: "+modelo+"\nCor: "+cor+"\nAno: "+ano;
    }
    public void mostraInfos(){
        System.out.println(this.toString());
    }
}
