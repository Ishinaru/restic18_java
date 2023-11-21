package calculadora_media;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNumeros {
    private ArrayList<Float> numeros = new ArrayList<Float>();

    public void inserirNumeros(float num){
        numeros.add(num);
    }

    public void mostrarMedia(){
        float media = 0;
        for(int i = 0; i < numeros.size(); i++){
            media += numeros.get(i);
        }
        media/=numeros.size();
        System.out.println("Media dos Numeros: "+media);
    }

    public static void main(String[] args) {
        ListaDeNumeros listaNum = new ListaDeNumeros();
        float num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Insira um numero: ");
            num = sc.nextFloat();
    
            if(num < 0)
                break;
            else{
                listaNum.inserirNumeros(num);
            }

        }while(num > 0);

        listaNum.mostrarMedia();
        sc.close();
    }
}
