public class Trecho {
    private PontoParada origem;
    private PontoParada destino;
    private int intervaloEstimado;

    public Trecho(PontoParada origem, PontoParada destino, int intervaloEstimado) {
        this.origem = origem;
        this.destino = destino;
        this.intervaloEstimado = intervaloEstimado;
    }

    public PontoParada getOrigem() {
        return origem;
    }

    public PontoParada getDestino() {
        return destino;
    }

    public int getIntervaloEstimado() {
        return intervaloEstimado;
    }

}