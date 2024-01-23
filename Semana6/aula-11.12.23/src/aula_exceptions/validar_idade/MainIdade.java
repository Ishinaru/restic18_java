package aula_exceptions.validar_idade;

import aula_exceptions.dividir_por_zero.Calculo;
import aula_exceptions.dividir_por_zero.ImpossivelDividirPorZeroException;

import java.util.Scanner;

public class MainIdade {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano, idade = 0;
        boolean isValida = true;

        System.out.print("Digite o dia: ");
        dia = sc.nextInt();
        System.out.print("Digite o mes: ");
        mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        ano = sc.nextInt();
        idade = ValidadorIdade.calculaIdade(dia, mes, ano);
        try {
            isValida = ValidadorIdade.validarIdade(dia, mes, ano);
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }


}
