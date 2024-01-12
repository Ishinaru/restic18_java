package aula_19_12_23.exercicio1;

import java.util.Random;

public class Pessoa {
    private final int tamanho = 10;
    private String[] nomes = new String[tamanho];

    public void preencheArrayNomes(){
        for (int i=0; i<tamanho;i++)
            this.nomes[i] = geraNome();
    }

    public {}

    public String geraNome(){
        String nome = null;
        Random random = new Random();
        switch(random.nextInt(26)){
            case 0:
                nome = "Kainê";
            case 1:
                nome = "David";
                break;
            case 2:
                nome = "Ian";
                break;
            case 3:
                nome = "Bia";
                break;
            case 4:
                nome = "Igor";
                break;
            case 5:
                nome = "Vitória";
                break;
            case 6:
                nome= "Clara";
                break;
            case 7:
                nome = "Jonathan";
                break;
            case 8:
                nome = "Daniel";
                break;
            case 9:
                nome = "Pedro";
                break;
            case 10:
                nome = "Sophia";
                break;
            case 11:
                nome = "Lucas";
                break;
            case 12:
                nome = "Isabella";
                break;
            case 13:
                nome = "Gabriel";
                break;
            case 14:
                nome = "Larissa";
                break;
            case 15:
                nome = "Matheus";
                break;
            case 16:
                nome = "Mariana";
                break;
            case 17:
                nome = "Diego";
                break;
            case 18:
                nome = "Fernanda";
                break;
            case 19:
                nome = "Carlos";
                break;
            case 20:
                nome = "Juliana";
                break;
            case 21:
                nome = "Rafael";
                break;
            case 22:
                nome = "Amanda";
                break;
            case 23:
                nome = "Gustavo";
                break;
            case 24:
                nome = "Natália";
                break;
            case 25:
                nome = "Ricardo";
                break;

        }
        return nome;
    }
}
