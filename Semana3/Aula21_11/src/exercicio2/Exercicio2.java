package exercicio2;

public class Exercicio2 {
	
	public static void calculaMediaPonderada(float n1, float n2, float n3, float p1, float p2, float p3) {
		float mediaP = (n1*p1 + n2*p2 + n3*p3)/(p1+p2+p3);
		System.out.printf("A media pondera é igual a %.2f",mediaP);
	}
}
