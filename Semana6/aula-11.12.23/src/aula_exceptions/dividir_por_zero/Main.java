package aula_exceptions.dividir_por_zero;

import aula_exceptions.dividir_por_zero.Calculo;
import aula_exceptions.dividir_por_zero.ImpossivelDividirPorZeroException;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int resultado = 0;
        System.out.print("Digite um inteiro A: ");
        a = sc.nextInt();
        System.out.print("Digite um inteiro B: ");
        b = sc.nextInt();
        try {
            resultado = Calculo.dividir(a, b);
        } catch (ImpossivelDividirPorZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O resultado foi: " + resultado);
        }
        float c;
        float d;
        float resultado2 = 0;
        System.out.print("Digite um float A: ");
        c = sc.nextFloat();
        System.out.print("Digite um float B: ");
        d = sc.nextFloat();

        try {
            resultado2 = Calculo.dividir(c,d);
        } catch (ImpossivelDividirPorZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O resultado foi: " + resultado2);
        }

    }
}