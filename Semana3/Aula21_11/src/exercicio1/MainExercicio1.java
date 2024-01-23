package exercicio1;

import java.util.Scanner;

public class MainExercicio1 {
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		Exercicio1.somaNumerosInt(n1, n2);
		
		sc.close();
	}
}	
