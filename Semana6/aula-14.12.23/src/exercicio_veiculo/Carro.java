package exercicio_veiculo;

public class Carro extends Veiculo{
    private int portas;
    private boolean temPorta = false;
    public Carro(String modelo, String cor, int ano, int portas) {
        super(modelo, cor, ano);
        this.portas = portas;
        this.temPorta = true;
    }

    public Carro(String modelo, String cor, int ano) {
        super(modelo, cor, ano);
    }

    @Override
    public String toString() {
        if(temPorta)
            return super.toString() + "\nNúmero de Portas: "+portas;
        else
            return super.toString();
    }
    public void mostraInfos(){
        System.out.println(this.toString());
    }
}
