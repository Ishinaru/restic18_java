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
        String aux = Clientes.apenasNumeral(cpf);
        for (Clientes cliente : listaClientes){
            if (aux.equals(Clientes.apenasNumeral(cliente.getCpf()))){
                System.out.println("---------------------------------------------------------------------");
                cliente.mostrarCliente();
                System.out.println("---------------------------------------------------------------------\n");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    public void listarClientes(){
        for(Clientes cliente: listaClientes) {
            System.out.println("---------------------------------------------------------------------");
            cliente.mostrarCliente();
            System.out.println("---------------------------------------------------------------------\n");
        }
        System.out.println("---------------------------------------------------------------------");
    }

    public void excluirCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF do Cliente para excluir: ");
        String cpf = sc.nextLine();
        String aux = Clientes.apenasNumeral(cpf);
        for (Clientes cliente : listaClientes){
            if (aux.equals(Clientes.apenasNumeral(cliente.getCpf()))){
                listaClientes.remove(cliente);
                System.out.println("Cliente excluido com sucesso!!!");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    public void alterarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o CPF do Cliente para editar: ");
        String cpf = sc.nextLine();
        String aux = Clientes.apenasNumeral(cpf);
        int opcao;
        for (Clientes cliente : listaClientes){
            if (aux.equals(Clientes.apenasNumeral(cliente.getCpf()))){
                do {
                    System.out.println("O que deseja alterar do cliente " + cliente.getNome() + "?");
                    System.out.println( "1 - Alterar Nome\n" +
                                        "2 - Alterar CPF\n" +
                                        "0 - Sair\n");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 1){
                        System.out.print("Novo nome: ");
                        cliente.setNome(sc.nextLine());
                        System.out.println("Nome alterado com sucesso!!!");
                        return;
                    }
                    else if(opcao == 2){
                        System.out.println("Novo CPF");
                        cliente.setCpf(sc.nextLine());
                        System.out.println("CPF alterado com sucesso!!!");
                        return;
                    }
                    else
                        return;

                }while (true);

            }
        }
        System.out.println("Cliente não encontrado!");
    }
    public static void main(String[] args) {
        MenuGestaoClientes menuClientes = new MenuGestaoClientes();
        menuClientes.exibirMenu();
    }
}
