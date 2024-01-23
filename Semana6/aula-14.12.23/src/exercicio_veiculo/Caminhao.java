package exercicio_veiculo;

public class Caminhao extends Veiculo{
    private int numEixos;
    private double capMaxima;
    private boolean temNumEixos = false, temCapMax = false;
    public Caminhao(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    public Caminhao(String modelo, String cor, int ano, int numEixos) {
        super(modelo, cor, ano);
        this.numEixos = numEixos;
        this.temNumEixos = true;
    }

    public Caminhao(String modelo, String cor, int ano, double capMaxima) {
        super(modelo, cor, ano);
        this.capMaxima = capMaxima;
        this.temCapMax = true;
    }
    public Caminhao(String modelo, String cor, int ano, int numEixos, double capMaxima) {
        super(modelo, cor, ano);
        this.capMaxima = capMaxima;
        this.numEixos = numEixos;
        this.temNumEixos = true;
        this.temCapMax = true;
    }

    public String toString(){
        if(temNumEixos && !temCapMax)
            return super.toString()+"\nNúmero de Eixos: "+numEixos;
        else if(!temNumEixos && temCapMax)
            return super.toString()+"\nCapacidade Máxima: "+capMaxima;
        else if(!temNumEixos && !temCapMax)
            return super.toString();
        else
            return super.toString()+"\nNúmero de Eixos: "+numEixos+"\nCapacidade Máxima: "+capMaxima;
    }

    public void mostraInfos(){
        System.out.println(this.toString());
    }
}
