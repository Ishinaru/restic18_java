package aula_exceptions.validar_idade;

public class ValidadorIdade {
     public static boolean validarIdade (int dia, int mes, int ano) throws IdadeInvalidaException{
         int idade = calculaIdade(dia, mes, ano);

         if(idade < 0 || idade >150)
             throw new IdadeInvalidaException(idade);
         else
             return true;
    }

    public static int calculaIdade(int dia, int mes, int ano){
         return 2023 - ano;
    }
}

