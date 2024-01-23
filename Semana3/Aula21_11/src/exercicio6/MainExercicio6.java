package exercicio6;

import java.util.Scanner;

public class MainExercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a largura do retangulo: ");
		int larg = sc.nextInt();
		System.out.print("Digite a altura do retangulo: ");
		int alt = sc.nextInt();
		Exercicio6.calculaArea(alt, larg);
		
		sc.close();
	}
}
