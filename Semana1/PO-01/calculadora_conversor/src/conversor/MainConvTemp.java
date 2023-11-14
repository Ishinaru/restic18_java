package conversor;

import java.util.Scanner;

public class MainConvTemp {
    public static void main(String[] args) {
        double grau;
        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while(cont){

            System.out.print("Escreva o grau: ");
            grau = sc.nextDouble();
            ConversorTemperatura c1 = new ConversorTemperatura(grau);
            System.out.println("Escolha a unidade de origem: ");
            System.out.println("1 - Celsius");
            System.out.println("2 - Fahrenheit");
            
            int opc = sc.nextInt();
            sc.nextLine();
            
            switch (opc) {
                case 1:
                    c1.celsiusToFahrenheint();
                    break;
                case 2:
                    c1.fahrenheintToCelsius();
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
