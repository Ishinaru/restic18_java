package conversor_moedas;

import java.util.Scanner;

public class MainConversorMoedas {
    public static void main(String[] args) {

        double moeda, taxa;
        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while(cont){
            System.out.print("Digite a taxa de cambio: ");
            taxa = sc.nextDouble();
            System.out.print("Digite a quantidade em dolar: ");
            moeda = sc.nextDouble();

            ConversorMoedas cm = new ConversorMoedas(moeda, taxa);
            cm.converteMoeda();

            sc.nextLine();

            System.out.print("Deseja continuar? ");
            String opcao = sc.nextLine();
            if(opcao.equals("nao") || opcao.equals("n"))
                cont = false;
        }
        sc.close();
    }
}
