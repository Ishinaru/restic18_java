package exercicio7;

import java.util.Scanner;

public class MainExercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo numero inteiro: ");
		int num2 = sc.nextInt();
		Exercicio7.trocarNumeros(num1, num2);
		System.out.println("Usando a troca com XOR");
		Exercicio7.trocarNumerosXor(num1, num2);
		
		sc.close();
	}

}	
