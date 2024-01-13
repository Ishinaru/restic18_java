package po_06.exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trajeto {
    List<Trecho>trechosPercorridos = new ArrayList<>();

    public void addTrechos(Trecho trecho){
        trechosPercorridos.add(trecho);
    }
    private List<Trecho> listarTrechos(){
        return trechosPercorridos;
    }
    public String toString(){
        String str = "";
        for (Trecho t : trechosPercorridos) {
            str += t.toString() + "\n\t\t";
        }
        return "Trajeto:\n\t\t" + str;
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
            trajeto.addTrechos(trecho);
        }
        trajeto.printTrajeto();

    }
}
