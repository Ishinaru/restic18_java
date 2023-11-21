package calculadora;

public class Calculadora {

    public void soma(float n1, float n2){
        System.out.printf("A soma de %f + %f = %f\n", n1, n2, n1+n2);
    }
    public void subtracao(float n1, float n2){
        System.out.printf("A subtração de %f - %f = %f\n", n1, n2, n1-n2);
    }
    public void multiplicacao(float n1, float n2){
        System.out.printf("A multiplicação de %f * %f = %f\n", n1, n2, n1*n2);
    }
    public void divisao(int n1, int n2){
        int div;
        try {
            div = n1 / n2;
            if(n2 == 0){
                throw new DivisionByZeroException();
            }
        }
        catch (DivisionByZeroException e){
            System.out.println("Exceção"+e+"causada por divisão por zero");
        }
        System.out.printf("A divisão de %d / %d = %d", n1, n2, n1/n2);
    }
    public void divisao(float n1, float n2){
        float div;
        try {
            div = n1 / n2;
            if (n2 == 0) {
                throw new DivisionByZeroException();
            }
        } catch (DivisionByZeroException e) {
            System.out.println("Exceção " + e + " causada por divisão por zero");
        }
        System.out.printf("A divisão de %f / %f = %f\n", n1, n2, n1 / n2);
    }
}
