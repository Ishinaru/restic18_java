package op_03;

public class Main {

    public static void main(String[] args) {

        Calculadora cal1 = new Calculadora();
        try {
            System.out.println(cal1.divisao(args[0] ,args[1]));
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMsgPersonalizada());
        }
    }
}
