package jogo_adivinhacao;

import java.util.Random;

public class JogoAdivinhacao {
    private int numero = gerarNumAleatorio();

    public int getNumero() {
        return numero;
    }

    public int gerarNumAleatorio(){
        Random aleat = new Random();
        return (int)aleat.nextDouble(101);
    }
}
