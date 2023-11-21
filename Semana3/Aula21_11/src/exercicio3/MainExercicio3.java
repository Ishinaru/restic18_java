package exercicio3;

import java.util.Scanner;

public class MainExercicio3 {
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua primeira string: ");
		str1 = sc.nextLine();
		System.out.print("Digite sua segunda string: ");
		str2 = sc.nextLine();
		Exercicio3.concatenarString(str1, str2);
		sc.close();
		
	}
}
