package po_06.exercicio4;

public class Trecho {
    PontoParada pontoOrigem;
    PontoParada pontoDestino;

    public Trecho(PontoParada pontoOrigem, PontoParada pontoDestino) {
        this.pontoOrigem = pontoOrigem;
        this.pontoDestino = pontoDestino;
    }
    public String toString() {
        return "Trecho: ("+pontoOrigem.getNome()+" , "+pontoDestino.getNome()+")";
    }

    public void printTrecho(){
        System.out.println(this.toString());
    }

}
