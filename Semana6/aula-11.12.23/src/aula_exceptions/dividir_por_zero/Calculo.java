package aula_exceptions.dividir_por_zero;

public class Calculo {

    public  static int dividir(int dividendo, int divisor)throws ImpossivelDividirPorZeroException {
            if(divisor == 0)
                throw new ImpossivelDividirPorZeroException(dividendo);
            else
                return dividendo/divisor;
    }

    public  static float dividir(float dividendo, float divisor)throws ImpossivelDividirPorZeroException{
        if(divisor == 0)
            throw new ImpossivelDividirPorZeroException(dividendo);
        else
            return dividendo/divisor;
    }
}

