package aula_exceptions.dividir_por_zero;

public class ImpossivelDividirPorZeroException extends Exception{
    private float dividendo;

    public ImpossivelDividirPorZeroException(int dividendo) {
        this.dividendo = (int)dividendo;
    }

    public ImpossivelDividirPorZeroException(float dividendo){
        this.dividendo = dividendo;
    }

    public String getMessage(){
        return "Impossível dividir "+dividendo+" por zero!";
    }
}
