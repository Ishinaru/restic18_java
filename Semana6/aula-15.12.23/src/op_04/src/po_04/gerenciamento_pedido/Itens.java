package po_04.gerenciamento_pedido;

public class Itens {
    private double preco;
    private String nome;

    public Itens(double preco) {
        this.preco = preco;
    }

    public Itens(String nome) {
        this.nome = nome;
    }

    public Itens(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "\tNome do Item: "+nome+"\t|\tPreço: "+String.format("%.2f",preco);
    }

    public void mostrarItem(){
        System.out.println(this.toString());
    }
}
