package conversor;

public class ConversorTemperatura {
    private double temp;

    public ConversorTemperatura(double temp){
        this.temp = temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void celsiusToFahrenheint(){
        double f = (temp * 9/5) + 32;
        System.out.printf("A temperatura %.1f °C equivale a %.1f °F.\n", temp , f);  
    }

    public void fahrenheintToCelsius(){
        double c = ((temp - 32) * 5)/9;
        System.out.printf("A temperatura %.1f °C equivale a %.1f °F.\n", c, temp);
    }
}
