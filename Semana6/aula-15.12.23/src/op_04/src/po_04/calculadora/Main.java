package po_04.calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivisaoPorZeroException {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();


        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.print("Y = ");
        int y = sc.nextInt();
        System.out.println("Soma = "+calc.soma(x,y));
        System.out.println("Subtração = "+calc.subtracao(x,y));
        System.out.println("Multiplicação = "+calc.multiplicacao(x,y));
        try {
            System.out.println("Divisão = "+calc.divisao(x,y));
        } catch (DivisaoPorZeroException e) {
            throw new RuntimeException(e);
        }
        System.out.print("Escolha a quantidade de elementos: ");
        int qtd = sc.nextInt();
        int num;
        ArrayList<Integer>lista_num = new ArrayList<>();
        for (int i = 0; i<qtd;i++) {
            System.out.print("Número = ");
            num = sc.nextInt();
            lista_num.add(num);
        }
        System.out.println("Soma = "+calc.soma(lista_num));
        System.out.println("Subtração = "+calc.subtracao(lista_num));
        System.out.println("Multiplicação = "+calc.multiplicacao(lista_num));
        System.out.println("Divisão = "+calc.divisao(lista_num));

    }
}