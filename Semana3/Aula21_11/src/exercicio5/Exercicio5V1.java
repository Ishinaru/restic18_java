package exercicio5;

public class Exercicio5V1 {
	public static void celsiusToFahrenheint(float temp){
        double f = (temp * 9/5) + 32;
        System.out.printf("A temperatura %.1f °C equivale a %.1f °F.\n", temp , f);  
    }

    public static void fahrenheintToCelsius(float temp){
        double c = ((temp - 32) * 5)/9;
        System.out.printf("A temperatura %.1f °F equivale a %.1f °C.\n", temp, c);
    }
}
