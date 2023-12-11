package aula_exceptions.caixa_eletronico;

public class SacarValorInvalidoException extends  Exception{

    private int valor;

    public SacarValorInvalidoException(int valor) {
        this.valor = valor;
    }

    public String getMessage(){
        return "Valor de R$ "+valor+" para saque inválido";
    }
}
