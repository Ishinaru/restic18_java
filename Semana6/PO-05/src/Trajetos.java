import java.util.List;

public class Trajeto {
    private List<Trecho> trechos;

    public Trajeto(List<Trecho> trechos) {
        this.trechos = trechos;
    }

    public List<Trecho> getTrechos() {
        return trechos;
    }

}