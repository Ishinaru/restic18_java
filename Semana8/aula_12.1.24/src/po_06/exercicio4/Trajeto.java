package po_06.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trajeto {
    List<Trecho>trechosPercorridos = new ArrayList<>();

    public void addTrechos(Trecho trecho){
        trechosPercorridos.add(trecho);
    }
    public void addTrechos(List<Trecho> listaTrechos){
        trechosPercorridos.addAll(listaTrechos);
    }
    private List<Trecho> listarTrechos(){
        return trechosPercorridos;
    }

    public int tempoTotal(){
        int tempoTotal = 0;
        for(Trecho t : trechosPercorridos)
            tempoTotal+= t.getTempoTrajeto();
        return tempoTotal;
    }
    public String toString(){
        String str = "";
        String str2 = "\n------------------------------------------------------------------------------------";
        for (Trecho t : trechosPercorridos) {
            str += t.toString() + "\n\t\t";
        }
        return "Trajeto:\n\t\t" + str +"\n\t\tDuração do trajeto: "+tempoTotal()+" minutos"+str2;
    }

    public void printTrajeto(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Trecho> trechos = new ArrayList<>();
        Trajeto trajeto = new Trajeto();

        for(int i = 0 ; i < 3; i++){
            System.out.print("Ponto Origem: ");
            String nome = sc.nextLine();
            PontoParada pOrigem = new PontoParada(nome);
            System.out.print("Ponto Destino: ");
            nome = sc.nextLine();
            PontoParada pDestino = new PontoParada(nome);
            System.out.print("Tempo de viagem (em minutos): ");
            int tempo = sc.nextInt();
            sc.nextLine();
            Trecho trecho = new Trecho(pOrigem, pDestino, tempo);
            trechos.add(trecho);

        }
        trajeto.addTrechos(trechos);
        trajeto.printTrajeto();

    }
}
