package exercicio7;

public class Exercicio7 {
	public static void trocarNumeros(int num1, int num2) {
		System.out.print("Num1 = " +num1+" , Num2 = "+num2);
		int aux;
		aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println(" após trocados Num1 = "+num1+" , Num2 = "+num2);
	}
	
	public static void trocarNumerosXor(int num1, int num2) {
		System.out.print("Num1 = " +num1+" , Num2 = "+num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println(" após trocados Num1 = "+num1+" , Num2 = "+num2);
	}
}
