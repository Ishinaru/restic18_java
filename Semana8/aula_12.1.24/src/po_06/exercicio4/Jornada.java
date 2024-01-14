package po_06.exercicio4;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jornada {
    Motorista motoristaDaJornada;
    Cobrador cobradorDaJornada;
    Veiculo veiculoDaJornada;
    Trajeto trajetoDaJornada;
    LocalDateTime horaInicioJornada;
    LocalDateTime horaFinalJornada;

    public Jornada(Motorista motoristaDaJornada, Cobrador cobradorDaJornada, Veiculo veiculoDaJornada, Trajeto trajetoDaJornada, LocalDateTime horaInicioJornada, LocalDateTime horaFinalJornada) {
        this.motoristaDaJornada = motoristaDaJornada;
        this.cobradorDaJornada = cobradorDaJornada;
        this.veiculoDaJornada = veiculoDaJornada;
        this.trajetoDaJornada = trajetoDaJornada;
        this.horaInicioJornada = horaInicioJornada;
        this.horaFinalJornada = horaFinalJornada;
    }

    public Jornada(Motorista motoristaDaJornada, Veiculo veiculoDaJornada, Trajeto trajetoDaJornada, LocalDateTime horaInicioJornada, LocalDateTime horaFinalJornada) {
        this.motoristaDaJornada = motoristaDaJornada;
        this.veiculoDaJornada = veiculoDaJornada;
        this.trajetoDaJornada = trajetoDaJornada;
        this.horaInicioJornada = horaInicioJornada;
        this.horaFinalJornada = horaFinalJornada;
        this.cobradorDaJornada = null;
    }

    public String toString(){
        DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String horaInicioFormatada = horaInicioJornada.format(dataHoraFormatada);
        String horaFinalFormatada = horaFinalJornada.format(dataHoraFormatada);
        String str = "\n------------------------------------------------------------------------------------";
        if(cobradorDaJornada!=null)
            return "Jornada:"+str+"\n\t"+motoristaDaJornada.toString()+"\n\t"+cobradorDaJornada.toString()+
                    "\n\t"+veiculoDaJornada.toString()+"\n\t"+trajetoDaJornada.toString()+"\n\tHora Início: "+horaInicioFormatada+"\t|\tHora Término: "+horaFinalFormatada+str+str;
        else
            return "Jornada:"+str+"\n\t"+motoristaDaJornada.toString()+
                    "\n\t"+veiculoDaJornada.toString()+"\n\t"+trajetoDaJornada.toString()+"\n\tHora Início: "+horaInicioFormatada+"\t|\tHora Término: "+horaFinalFormatada+str+str;
    }

    public void printJornada(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Motorista motorista = new Motorista("Marcos", "12345678910");
        Cobrador cobrador = new Cobrador("Mauro", "01001001001");
        Veiculo veiculo = new Veiculo("12345JKL", "Mercedes");

        LocalDateTime horaInicio = LocalDateTime.now();
        LocalDateTime horaFinal = LocalDateTime.of(2024, 1, 14, 20, 0, 0);
        Jornada jornada;
        List<Trecho> trechos = new ArrayList<>();
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
        jornada = new Jornada(motorista, cobrador, veiculo, trajeto, horaInicio, horaFinal);
        jornada.printJornada();
    }
}
