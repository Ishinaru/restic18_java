package exercicio5;

public class Exercicio5V2 {
	public static void converterGraus(float temp, int opc) {
		if(opc == 0) {
			double f = (temp * 9/5) + 32;
	        System.out.printf("A temperatura %.1f °C equivale a %.1f °F.\n", temp , f);
		}
		else if(opc == 1){
			double c = ((temp - 32) * 5)/9;
	        System.out.printf("A temperatura %.1f °F equivale a %.1f °C.\n", temp, c);
		}
		else 
	        System.out.printf("Opção invalida!");
		
		
	}
}
