package po_04.calculadora;

import java.util.ArrayList;

public class Calculadora{
    public int soma(int x, int y){return x+y;}
    public double soma(double x, double y){return x+y;}

    public int soma(ArrayList<Integer>num){
        int soma = 0;
        for(int i: num){
            soma+=i;
        }
        return soma;
    }
    public int subtracao(int x, int y){return x-y;}
    public double subtracao(double x, double y){return x-y;}
    public int subtracao(ArrayList<Integer>num){
        int sub = 0;
        for(int i:num){
            sub-=i;
        }
        return sub;
    }
    public int multiplicacao(int x, int y){return x*y;}
    public double multiplicacao(double x, double y){return x*y;}

    public int multiplicacao(ArrayList<Integer>num){
        int mul = 1;
        for (int i:num){
            mul*=i;
        }
        return mul;
    }
    public int divisao(int x, int y)throws DivisaoPorZeroException{
            if(y==0)
                throw new DivisaoPorZeroException("Divisão por zero, erro!");
            else
        return x/y;
    }
    public double divisao(double x, double y)throws DivisaoPorZeroException{
        if(y==0)
            throw new DivisaoPorZeroException("Divisão por zero, erro!");
        else
            return x/y;
    }

    public int divisao(String x, String y) throws DivisaoPorZeroException {
        int _x=0 , _y=0 , div;

        try{
            _x = Integer.parseInt(x); _y = Integer.parseInt(y);
        }
        catch (NumberFormatException a){
            throw new DivisaoPorZeroException("Erro do tipo: "+a.getMessage());
        }

        if(_y==0)
            throw new DivisaoPorZeroException("Divisão por zero, erro!");

        div = _x/_y;

        return div;
    }

    public int divisao(ArrayList<Integer>num){
        int div = 1;
        for (int i: num){
            div/=i;
        }
        return div;
    }

}


