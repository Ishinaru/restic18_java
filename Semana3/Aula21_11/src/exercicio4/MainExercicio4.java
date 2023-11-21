package exercicio4;

import java.util.Scanner;

public class MainExercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int num = sc.nextInt();
		if(Exercicio4.verificaParidade(num))
			System.out.println("O numero "+num+" é par");
		else
			System.out.println("O numero "+num+" é impar");
		sc.close();
	}
}
