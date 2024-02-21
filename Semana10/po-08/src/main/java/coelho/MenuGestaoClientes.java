package coelho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuGestaoClientes {
    private List<Clientes> listaClientes = new ArrayList<>();

    public void exibirMenu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("\t\t Menu de Gestão de Clientes \t\t");
            System.out.println("---------------------------------------------------------------------");
            System.out.println( "1 - Incluir cliente\n" +
                                "2 - Consultar cliente (por CPF)\n" +
                                "3 - Listar clientes\n" +
                                "4 - Excluir cliente (por CPF)\n" +
                                "5 - Alterar cliente (por CPF)\n" +
                                "0 - Sair");
            System.out.print("Escolha uma opção: ");

                int opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        incluirCliente();
                        break;
                    case 2:
                        consultarCliente();
                        break;
                    case 3:
                        listarClientes();
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 0:
                        return;
                }

        }while (true);
        sc.close();

    }

    public void incluirCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t INCLUIR CLIENTE \t\t");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();
        Clientes cliente = new Clientes(nome, cpf);
        listaClientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso!!");
    }

    public void consultarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF do Cliente para consulta: ");
        String cpf = sc.nextLine();
        for (Clientes cliente : listaClientes){
            if (cpf.equals(cliente.getCpf())) {
                System.out.println("---------------------------------------------------------------------");
                cliente.mostrarCliente();
                System.out.println("---------------------------------------------------------------------\n");
            }
            else
                System.out.println("Cliente não encontrado!");
        }
    }
    public void listarClientes(){
        for(Clientes cliente: listaClientes) {
            System.out.println("---------------------------------------------------------------------");
            cliente.mostrarCliente();
            System.out.println("---------------------------------------------------------------------\n");
        }
        System.out.println("---------------------------------------------------------------------");
    }


    public static void main(String[] args) {
        MenuGestaoClientes menuClientes = new MenuGestaoClientes();
        menuClientes.exibirMenu();
    }
}
