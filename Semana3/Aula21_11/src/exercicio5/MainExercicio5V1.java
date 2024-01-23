package exercicio5;

import java.util.Scanner;

public class MainExercicio5V1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		float temp;
		System.out.println("Deseja entrar com a temperatura em Celsius ou Fahrenheit?");
		System.out.println("0 - Converter Celsius para Fahrenheit.");
		System.out.println("1 - Converter Fahrenheit para Celsius.");
		opc = sc.nextInt();
		System.out.println("Digite a temperatura a ser convertida: ");
		temp = sc.nextFloat();
		
		switch (opc) {
		case 0:
			Exercicio5V1.celsiusToFahrenheint(temp);
			break;
		
		case 1:
			Exercicio5V1.fahrenheintToCelsius(temp);;
			break;
			
		default:
			break;
		}
		
		sc.close();
	}
}
