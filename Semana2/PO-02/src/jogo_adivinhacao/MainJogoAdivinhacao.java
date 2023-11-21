package jogo_adivinhacao;

import conversor_moedas.ConversorMoedas;

import java.util.Scanner;

public class MainJogoAdivinhacao {
    public static void main(String[] args) {
        int numAdivinhado;
        Scanner sc = new Scanner(System.in);
        JogoAdivinhacao numero = new JogoAdivinhacao();
        boolean cont = true;

    while(cont){
        System.out.println("Tente adivinhar o número:");
        do {
            System.out.print("Digite o seu palpite: ");
            numAdivinhado = sc.nextInt();
            sc.nextLine();
            if(numAdivinhado < numero.getNumero())
                System.out.println("Muito baixo!!!");
            else
                System.out.println("Muito alto!!!");

        } while (numero.getNumero() != numAdivinhado);

        System.out.println("Parabéns, você acertou!!!");
        System.out.print("Deseja continuar? ");
        String opcao = sc.nextLine();

        if (opcao.equals("nao") || opcao.equals("n"))
            cont = false;

    }
        sc.close();
    }
}
