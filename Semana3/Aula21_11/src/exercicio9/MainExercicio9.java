package exercicio9;

import java.util.Scanner;

public class MainExercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		float num1 = sc.nextFloat();
		System.out.print("Digite o segundo número: ");
		float num2 = sc.nextFloat();
		sc.nextLine();

		Exercicio9.mostrarMenu();
		char opc = sc.next().charAt(0);
		
		switch (opc) {
		case 'A':
			System.out.print("Adição = "+Exercicio9.adicao(num1, num2));
			break;
		case 'S':
			System.out.print("Subtração = "+Exercicio9.subtracao(num1, num2));
			break;
		case 'M':
			System.out.print("Multiplicação = "+Exercicio9.multiplicacao(num1, num2));
			break;
		case 'D':
			System.out.print("Divisão = "+Exercicio9.divisao(num1, num2));
			break;
		default:
			break;
		}
		
		
		
		
	}
}
