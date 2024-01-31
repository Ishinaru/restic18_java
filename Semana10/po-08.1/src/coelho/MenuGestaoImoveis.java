package coelho;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MenuGestaoImoveis {
    private static List<Imoveis> listaImoveis = new ArrayList<>();
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
                    consultarImovel();
                    break;
                case 3:
                    listarImoveis();
                    break;
                    /*
                case 4:
                    excluirCliente();
                    break;
                case 5:
                    alterarCliente();
                    break;*/
                case 0:
                    return;
            }
        }while (true);

    }

    public static Imoveis incluirImovel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\t\t INCLUIR IMÓVEL \t\t");
        System.out.println("---------------------------------------------------------------------");
        System.out.print("Digite o endereço do imóvel: ");
        String endereco = sc.nextLine();

        System.out.print("Digite o valor da penúltima leitura do imóvel: ");

        double penultimaLeitura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite o valor da última leitura do imóvel: ");
        double ultimaLeitura = sc.nextDouble();
        sc.nextLine();
        Imoveis imovel = new Imoveis(endereco, penultimaLeitura, ultimaLeitura);
        listaImoveis.add(imovel);
        System.out.println("Imóvel adicionado com sucesso!!");
        return imovel;
    }

    public void consultarImovel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Matrícula do Imóvel para consulta: ");
        String matricula = sc.nextLine();
        int matriculaInt = Integer.parseInt(matricula);
        for (Imoveis imovel : listaImoveis){
            if (matriculaInt == Integer.parseInt(imovel.getMatricula())){
                System.out.println("----------------------------------------------------------------------------------------------");
                imovel.mostrarImovel();
                return;
            }
        }
        System.out.println("Imóvel não encontrado!");
    }

    public void listarImoveis(){
        for(Imoveis i : listaImoveis){
            i.mostrarImovel();
        }
    }

    public static void main(String[] args) {
        MenuGestaoImoveis menuGestao = new MenuGestaoImoveis();
        menuGestao.exibirMenu();
    }

}
