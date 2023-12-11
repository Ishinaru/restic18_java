package aula_exceptions.caixa_eletronico;

import aula_exceptions.dividir_por_zero.Calculo;
import aula_exceptions.dividir_por_zero.ImpossivelDividirPorZeroException;

import java.util.Scanner;

public class MainCaixaEletronico {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, resultado = 0;
        System.out.print("Digite o valor de saque: ");
        valor = sc.nextInt();

        try {
            resultado = CaixaEletronico.sacar(valor);
        } catch (SacarValorInvalidoException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("O resultado foi: " + resultado);
        }
        sc.close();

    }
}
