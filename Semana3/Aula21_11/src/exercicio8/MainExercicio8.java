package exercicio8;

import java.util.Scanner;

public class MainExercicio8 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		if(Exercicio8.verificaMaiorIdade(idade))
			System.out.println("Maior de idade");
		else
			System.out.println("Menor de idade");
		
		System.out.print("Digite seu ano de nascimento: ");
		int anoNasc = sc.nextInt();
		System.out.print("Digite seu mes de nascimento: ");
		int mesNasc = sc.nextInt();
		System.out.print("Digite seu dia de nascimento: ");
		int diaNasc = sc.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.print("Digite o mes atual: ");
		int mesAtual = sc.nextInt();
		System.out.print("Digite o dia atual: ");
		int diaAtual = sc.nextInt();
		
		idade = Exercicio8.calculaIdade(diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual);
		System.out.println("Sua idade é de "+idade+" anos.");
		sc.close();
	}
}
