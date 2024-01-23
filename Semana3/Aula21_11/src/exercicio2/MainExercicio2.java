package exercicio2;

import java.util.Scanner;

public class MainExercicio2 {
	public static void main(String[] args) {
		float nota1, nota2, nota3, peso1, peso2, peso3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a primeira nota e o peso: ");
		nota1 = sc.nextFloat();
		peso1 = sc.nextFloat();
		System.out.print("Digite a segunda nota e o peso: ");
		nota2 = sc.nextFloat();
		peso2 = sc.nextFloat();
		System.out.print("Digite a terceira nota e o peso: ");
		nota3 = sc.nextFloat();
		peso3 = sc.nextFloat();
		Exercicio2.calculaMediaPonderada(nota1, nota2, nota3, peso1, peso2, peso3);
		
		sc.close();
	}
}
