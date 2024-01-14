package po_06.exercicio4;

import java.util.List;
import java.util.ArrayList;
public class Veiculo {
    private static int proxVeiculo = 1;
    private int idVeiculo;
    private String modelo;
    private String placa;
    private List<PontoParada> pontosEstacionados;

    public Veiculo(String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
        this.pontosEstacionados = new ArrayList<>();
        this.idVeiculo = proxVeiculo++;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public int getIdVeiculo(){
        return idVeiculo;
    }

    public List<PontoParada> getPontosEstacionados(){
        return pontosEstacionados;
    }

    public void estacionar(PontoParada parada){
        pontosEstacionados.add(parada);
    }

    public String toString(){
        String str = "\n------------------------------------------------------------------------------------";
        return "Veículo:\tModelo: "+modelo+"\tPlaca: "+placa+"\n\t\t\t\tID Veículo: "+idVeiculo+str;
    }
    public void printVeiculo(){
        System.out.println(this.toString());
    }
}
