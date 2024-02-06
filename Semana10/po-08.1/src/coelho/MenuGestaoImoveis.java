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

                case 4:
                    excluirImovel();
                    break;
                case 5:
                    alterarImovel();
                    break;
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

    public static Imoveis consultaImoveis(String matricula){
        int matriculaInt = Integer.parseInt(matricula);
        for (Imoveis imovel : listaImoveis){
            if (matriculaInt == Integer.parseInt(imovel.getMatricula())){
                System.out.println("----------------------------------------------------------------------------------------------");
                imovel.mostrarImovel();
                return imovel;
            }
        }
        System.out.println("Imóvel não encontrado!");
        return null;
    }

    public void listarImoveis(){
        for(Imoveis i : listaImoveis){
            i.mostrarImovel();
        }
    }

    public void excluirImovel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Matrícula do Imóvel para excluir: ");
        String matricula = sc.nextLine();
        int matriculaInt = Integer.parseInt(matricula);
        for (Imoveis imovel : listaImoveis){
            if (matriculaInt == Integer.parseInt(imovel.getMatricula())){
                listaImoveis.remove(imovel);
                System.out.println("Imóvel removido com sucesso!!!");
                return;
            }
        }
        System.out.println("Imóvel não encontrado!");
    }

    public void alterarImovel(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Matrícula do Imóvel para alterar: ");
        String matricula = sc.nextLine();
        int matriculaInt = Integer.parseInt(matricula);
        int opcao;
        for (Imoveis imovel : listaImoveis){
            if (matriculaInt == Integer.parseInt(imovel.getMatricula())){
                do {
                    System.out.println("O que deseja alterar do imóvel " + imovel.getMatricula() + "?");
                    System.out.println( "1 - Alterar Endereço\n" +
                                        "2 - Alterar Penúltima Leitura\n" +
                                        "3 - Alterar Última Leitura\n" +
                                        "0 - Sair\n");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    if (opcao == 1){
                        System.out.print("Novo endereço: ");
                        imovel.setEndereco(sc.nextLine());
                        System.out.println("Endereço alterado com sucesso!!!");
                        return;
                    }
                    else if(opcao == 2){
                        System.out.print("Nova Penúltima Leitura:");
                        imovel.setPenultimaLeitura(sc.nextDouble());
                        System.out.println("Penúltima Leitura alterada com sucesso!!!");
                        return;
                    }
                    else if(opcao == 3){
                        System.out.print("Nova Última Leitura:");
                        imovel.setUltimaLeitura(sc.nextDouble());
                        System.out.println("Última Leitura alterada com sucesso!!!");
                        return;
                    }
                    else
                        return;

                }while (true);
            }
        }
        System.out.println("Imóvel não encontrado!");
    }
    public static void main(String[] args) {
        MenuGestaoImoveis menuGestao = new MenuGestaoImoveis();
        menuGestao.exibirMenu();
    }

}
