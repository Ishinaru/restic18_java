package conversor_moedas;

public class ConversorMoedas {
    private double valor;
    private double taxaCambio;

    public ConversorMoedas(double valor, double taxaCambio){
        this.valor = valor;
        this.taxaCambio = taxaCambio;
    }
    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getTaxaCambio() {
        return taxaCambio;
    }
    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public void converteMoeda(){
        double conversao = taxaCambio * valor;
        System.out.printf("A conversão de $%.2f pela taxa de conversão de $%.2f = %.2f\n", valor, taxaCambio, conversao);
    }
}
