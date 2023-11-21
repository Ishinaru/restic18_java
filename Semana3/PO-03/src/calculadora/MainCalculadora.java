package calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        boolean exit = false;

        while(!exit){
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Adição: ");
            System.out.println("2 - Subtração: ");
            System.out.println("3 - Multiplicação: ");
            System.out.println("4 - Divisão: ");
            System.out.println("0 - Sair: ");
            int opc = sc.nextInt();
            if (opc == 0)
                break;

            System.out.print("Primeiro número: ");
            float n1 = sc.nextFloat();

            System.out.print("Segundo número: ");
            float n2 = sc.nextFloat();

            switch (opc){
                case 1:
                    calc.soma(n1, n2);
                    break;

                case 2:
                    calc.subtracao(n1, n2);
                    break;

                case 3:
                    calc.multiplicacao(n1, n2);
                    break;

                case 4:
                    calc.divisao(n1, n2);
                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    break;
            }

        };
    }
}
