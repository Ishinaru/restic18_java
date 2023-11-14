package calculadorasimples;

import java.util.Scanner;

public class MainCalcSimples {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while(cont){

            System.out.print("Escreva o primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Escreva o segundo número: ");
            num2 = sc.nextDouble();
            CalculadoraSimples c1 = new CalculadoraSimples(num1, num2);
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            
            int opc = sc.nextInt();
            sc.nextLine();
            
            switch (opc) {
                case 1:
                    c1.adicao();
                    break;
                case 2:
                    c1.subtracao();
                    break;
                case 3:
                    c1.multiplicacao();
                    break;
                case 4:
                    c1.divisao();
                    break;
                default:
                    break;
            }
            System.out.print("Deseja continuar? ");
            String opSair = sc.nextLine();
            
            if(opSair.equals("nao") || opSair.equals("n"))
                cont = false;
              
        }   
        sc.close();
    }
    
}
