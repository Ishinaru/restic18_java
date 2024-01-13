package po_06.exercicio4;

public class Trecho {
    private PontoParada pontoOrigem;
    private PontoParada pontoDestino;
    private int tempoTrajeto;
    public Trecho(PontoParada pontoOrigem, PontoParada pontoDestino, int tempoTrajeto) {
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
        this.tempoTrajeto = tempoTrajeto;
    }

    public String toString() {
        return "Trecho: ("+pontoOrigem.getNome()+" , "+pontoDestino.getNome()+") - Duração: "+tempoTrajeto+" minutos";
    }

    public void printTrecho(){
        System.out.println(this.toString());
    }

}
