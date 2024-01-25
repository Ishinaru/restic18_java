import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @org.junit.jupiter.api.Test
    void definirAlfabeto() {
        Configuracao configuracao = new Configuracao();
        String senha = "ABCDEFGH";
        configuracao.definirAlfabeto(senha);
        assertEquals(senha, configuracao.getAlfabeto());
        }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestNulo(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "";
        try{
            configuracao.definirAlfabeto(alfabeto);
    }catch (Exception e){
            assertEquals("Alfabeto não pode ser nulo", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestMaiorZero(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "AB";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("O alfabeto deve possuir mais de 1\n" +
                    "caracter", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }


}
