package po_04.gerenciamento_pedido;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    private static int proximoNumPedido=1;
    private int numPedido;
    private String cpfCliente;
    ArrayList<Itens> listaItens = new ArrayList<Itens>();

    public Pedido() {
        this.numPedido+=proximoNumPedido++;
    }
    public Pedido(String cpfCliente) {
        this.cpfCliente = cpfCliente;
        this.numPedido ++;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void addItem(Itens item){
        this.listaItens.add(item);
    }

    public double calcularTotalPedidos(){
        double precoTotal = 0;
        for(Itens item: this.listaItens){
            precoTotal+= item.getPreco();
        }
        return precoTotal;
    }
    public void mostrarPedido(){
        System.out.println("Pedido Nº"+numPedido);
        System.out.println("CPF do Cliente: "+cpfCliente);
        System.out.println("Itens do Pedido:");
        for (Itens item:this.listaItens)
            item.mostrarItem();
        System.out.println("------------------");
        System.out.println("Preço total: "+String.format("%.2f",this.calcularTotalPedidos()));
    }

}

