package coelho;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuGestaoFaturas {
    private Imoveis imovelRelacionado;
    private List<Faturas> listaFaturas = new ArrayList<>();

    public void exibirMenu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("\t\t Menu de Gestão de Faturas \t\t");
            System.out.println("---------------------------------------------------------------------");
            System.out.println( "1 - Criar Fatura\n" +
                                "2 - Listar Faturas\n" +
                                "3 - Listar Faturas em aberto\n" +
                                "0 - Sair");

            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    criarFatura();
                    break;
                    /*
                case 2:
                    consultarCliente();
                    break;
                case 3:
                    listarClientes();
                    break;
                */
                case 0:
                    return;
            }
        }while (true);

    }

    public void criarFatura(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da matrícula do imóvel: ");
        String matricula = sc.nextLine();
        Imoveis imovel = MenuGestaoImoveis.consultaImoveis(matricula);
        if(imovel != null){
            this.imovelRelacionado = imovel;
            LocalDateTime dataLeitura = LocalDateTime.now();
            double consumo = calculaFatura(imovel.getUltimaLeitura());
            Faturas fatura = new Faturas(dataLeitura, consumo, imovel);
            listaFaturas.add(fatura);
        }
        else
            System.out.println("Imóvel não encontrado!!!");
    }

    public double calculaFatura(double consumo){
        return 10*consumo;
    }

    public void registraFatura(){
        Faturas fatura = new Faturas();
        imovelRelacionado.setPenultimaLeitura();
        imovelRelacionado.setUltimaLeitura();
        fat

    }
}
