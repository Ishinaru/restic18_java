package exercicio9;

public class Exercicio9 {
	public static void mostrarMenu() {
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("A - Adição");
		System.out.println("S - Subtração");
		System.out.println("M - Multiplicação");
		System.out.println("D - Divisão");
	}
	
	public static float adicao(float num1, float num2) {
		return num1 + num2;
	}
	
	public static float subtracao(float num1, float num2) {
		return num1 - num2;
	}
	
	public static float multiplicacao(float num1, float num2) {
		return num1 * num2;
	}
	
	public static float divisao(float num1, float num2) {
		return num1 / num2;
	}
}
