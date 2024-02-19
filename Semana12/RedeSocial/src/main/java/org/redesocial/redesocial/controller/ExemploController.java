package org.redesocial.redesocial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ExemploController {
    private int valor = 9999999;
    private int i = 0;
    private int j = 0;

    @RequestMapping("/exemplo")
    public int getValor(){
        return valor;
    }
    @RequestMapping("/aleatorio")
    public String geraAleatorio(){
        Random random = new Random();
       this.valor = random.nextInt();
       return "Número aleatório = "+valor;
    }

    @RequestMapping("/numerosequencia")
    public String geraNumerosSequencia(){
        i++;
        return i + " º número da sequência = " + i;

    }

    @RequestMapping("/numeroprimo")
    public String geraPrimo() {
        int num = 0;
        while (!ePrimo(j)){
            j++;
        }
        num = j;
        j++;
        return "Número primo = " + num;
    }

    public boolean ePrimo(int num){
        if (num<=1)
                return false;
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}
