package op_04;

import op_03.DivisaoPorZeroException;

public class Calculadora {
    public int soma(int x, int y){return x+y;}
    public double soma(double x, double y){return x+y;}
    public int subtracao(int x, int y){return x-y;}
    public double subtracao(double x, double y){return x-y;}
    public int multiplicacao(int x, int y){return x*y;}
    public double multiplicacao(double x, double y){return x*y;}
    public int divisao(int x, int y)throws DivisaoPorZeroException {
        if(y==0)
            throw new DivisaoPorZeroException("Divisão por zero, erro!");
        return x/y;
    }
    public double divisao(double x, double y)throws DivisaoPorZeroException{
        if(y==0)
            throw new DivisaoPorZeroException("Divisão por zero, erro!");
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
}