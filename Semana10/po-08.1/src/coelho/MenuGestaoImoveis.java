/*
package coelho;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuGestaoImoveis {
    private List<Imoveis> listaImoveis = new ArrayList<>();
    public void exibirMenu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("\t\t Menu de Gestão de Imóveis \t\t");
            System.out.println("---------------------------------------------------------------------");
            System.out.println( "1 - Incluir imóvel\n" +
                                "2 - Consultar imóvel (por Matrícula)\n" +
                                "3 - Listar imóveis\n" +
                                "4 - Excluir imóvel (por Matrícula)\n" +
                                "5 - Alterar imóvel (por Matrícula)\n" +
                                "0 - Sair");

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    incluirImovel();
                    break;

                case 2:
                    consultarCliente();
                    break;
                case 3:
                    listarClientes();
                    break;
                case 4:
                    excluirCliente();
                    break;
                case 5:
                    alterarCliente();
                    break;
                case 0:
                    return;
            }
        }while (true);

    }

    public void incluirImovel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t INCLUIR IMÓVEL \t\t");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Digite a matrícula: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        Clientes cliente = new Clientes(nome, cpf);
        listaClientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso!!");
    }

}
*/
