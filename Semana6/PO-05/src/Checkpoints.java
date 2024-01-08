import java.util.LocalTime;

public class Checkpoint {
    private PontoParada pontoParada;
    private LocalTime horarioChegada;

    public Checkpoint(PontoParada pontoParada, LocalTime horarioChegada) {
        this.pontoParada = pontoParada;
        this.horarioChegada = horarioChegada;
    }

    public void setPontoParada(PontoParada pontoParada) {
        this.pontoParada = pontoParada;
    }

    public Date getHorarioChegada() {
        return horarioChegada;
    }

}