package manipula_array;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
    private ArrayList<Integer> arrayNumero = new ArrayList<Integer>();

    public void criarArrayUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero para adicionar no array: ");
        int num = sc.nextInt();
        arrayNumero.add(num);
    }

    public void criarArrayAleat(){
        Random num = new Random();
        arrayNumero.add(num.nextInt(100));
    }

    public ArrayList<Integer> getArrayNumero() {
        return arrayNumero;
    }

    public int calculaElementos(){
        int soma = 0;
        for(int i = 0; i<arrayNumero.size();i++){
            soma+=arrayNumero.get(i);
        }
        return soma;
    }

    public int menorElemento(){
        int menor = arrayNumero.get(0);
        for(int i = 0; i<arrayNumero.size();i++){
            if(menor>arrayNumero.get(i))
                menor = arrayNumero.get(i);
        }
        return menor;
    }

    public int maiorElemento(){
        int maior = arrayNumero.get(0);
        for(int i = 0; i<arrayNumero.size();i++){
            if(arrayNumero.get(i)>maior)
                maior = arrayNumero.get(i);
        }
        return maior;
    }


}
