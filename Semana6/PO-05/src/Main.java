import java.util.Arrays;
import java.util.LocalTime;

public class Main{
    public static void main(String[] args) {
        PontoParada pontoOrigem = new PontoParada("Terminal 1");
        PontoParada pontoDestino = new PontoParada("Terminal 2");

        Trecho trecho = new Trecho(pontoOrigem, pontoDestino, 30);
        Trajeto trajeto = new Trajeto(Arrays.asList(trecho));

        Veiculo veiculo = new Veiculo("ABCD123", "Ônibus Mercedes");
        Motorista motorista = new Motorista("David","1234567890");
        Cobrador cobrador = new Cobrador("Claudio", "0001112223";

        Jornada jornada = new Jornada(Arrays.asList(trajeto), motorista, cobrador, veiculo);

        PontoParada checkpointParada = new PontoParada("Ponto de Checkpoint");
        Checkpoint checkpoint = new Checkpoint(checkpointParada, new LocalTime());

        jornada.getVeiculo().estacionar(checkpointParada);
        jornada.getMotorista().iniciarTrajeto(trajeto, checkpointParada);
    }
}