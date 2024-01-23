package aula_exceptions.caixa_eletronico;

public class CaixaEletronico {

    public static int sacar(int valor) throws SacarValorInvalidoException{
        int resto = valor;
        while(valor > 9){
            resto = valor % 10;
            valor = valor/10;
            if(resto != 0){
                throw new SacarValorInvalidoException(valor);
            }
            else
                return valor;
        }

        return resto;
    }


}
