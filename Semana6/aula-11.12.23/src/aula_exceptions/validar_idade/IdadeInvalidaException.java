package aula_exceptions.validar_idade;

public class IdadeInvalidaException extends Exception{
    int idade;

    public IdadeInvalidaException(int idade) {
        this.idade = idade;
    }

    public String getMessage(){
        return "A idade "+idade+" inválida!";
    }
}
