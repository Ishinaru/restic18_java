package po_04.gerenciamento_pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continua;
        do{
            Pedido pedido = new Pedido();
            System.out.println("Pedidos");
            System.out.println("-------------");
            System.out.println("Deseja incluir o Cpf do cliente? <1> sim | <0> não");
            int escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                System.out.print("CPF do Cliente: ");
                pedido.setCpfCliente(sc.nextLine());
            }

            do {
                System.out.println("Item do pedido: ");
                System.out.print("Nome do Item: ");
                String nome = sc.nextLine();
                System.out.print("Preço do Item: ");
                double preco = sc.nextDouble();
                sc.nextLine();

                Itens item = new Itens(preco, nome);
                pedido.addItem(item);
                System.out.println("Deseja adicionar mais itens? <s> para continuar");
                continua = sc.next().charAt(0);
                sc.nextLine();
            } while (continua == 's');

            pedido.mostrarPedido();
            System.out.println("Deseja adicionar mais pedidos? <s> para continuar");
            continua = sc.next().charAt(0);
        }while (continua == 's');
        sc.close();
    }
}
