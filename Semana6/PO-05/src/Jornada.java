import java.util.List;
import java.util.LocalTime;
public class Jornada{
    private LocalTime inicioJornada;
    private LocalTime fimJornada;
    private List<Trajeto> trajetos;
    private Motorista motorista;
    private Cobrador cobrador;
    private Veiculo veiculo;

    public Jornada(LocalTime inicioJornada, LocalTime fimJornada, List<Trajeto> trajetos, Motorista motorista, Cobrador cobrador, Veiculo veiculo) {
        this.trajetos = trajetos;
        this.motorista = motorista;
        this.cobrador = cobrador;
        this.veiculo = veiculo;
        this.inicioJornada = inicioJornada;
        this.fimJornada = fimJornada;
    }

    public Jornada(LocalTime inicioJornada, LocalTime fimJornada, List<Trajeto> trajetos, Motorista motorista, Veiculo veiculo) {
        this.inicioJornada = inicioJornada;
        this.fimJornada = fimJornada;
        this.trajetos = trajetos;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.cobrador = None;
    }

    public List<Trajeto> getTrajetos() {
        return trajetos;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public Cobradores getCobrador() {
        return cobrador;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public String toString(){
        return "Jornada(Início: "+inicioJornada+", Fim: "+fimJornada +")\n"+
                "Trajetos percorridos: "+trajetos+
                "\nMotorista: "+motorista+
                "\nCobrador: "+cobrador+
                "\nVeículo: "+veiculo;
    }

    public void printJornada(){
        System.out.println(this.toString());
    }

}