package calculadorasimples;

public class CalculadoraSimples {
    private double num1;
    private double num2;

    public CalculadoraSimples(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void adicao(){
        double soma = num1 + num2; 
        System.out.println(num1 + " + " + num2 + " = " + soma);
    }

    public void subtracao(){
        double sub = num1 - num2; 
        System.out.println(num1 + " - " + num2 + " = " + sub);
    }

    public void multiplicacao(){
        double mult = num1 * num2; 
        System.out.println(num1 + " * " + num2 + " = " + mult);
    }

    public void divisao(){
        double div = num1 / num2; 
        System.out.println(num1 + " / " + num2 + " = " + div);
    }
}
