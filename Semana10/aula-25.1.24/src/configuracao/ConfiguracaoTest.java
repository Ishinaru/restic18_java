package configuracao;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @org.junit.jupiter.api.Test
    void definirAlfabeto() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCDEFGH";
        try {
            configuracao.definirAlfabeto(alfabeto);
        } catch (Exception e) {
            fail("Gerou excecao indevida: "+e.getMessage());
        }
        assertEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestNulo(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Alfabeto não pode ser vazio ou nulo", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestMaiorZero(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "A";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("O alfabeto deve possuir mais de 1 caracter", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestRepetidoComeco(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "AABCDEFGH";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Não podem haver caracteres repetidos no alfabeto", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestRepetidoFinal(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCDEFGHH";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Não podem haver caracteres repetidos no alfabeto", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestRepetidoComecoFinal(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCDEFGHA";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Não podem haver caracteres repetidos no alfabeto", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestRepetidoMeioFinal(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCDHFGH";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Não podem haver caracteres repetidos no alfabeto", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestRepetidoComecoMeio(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCDAFGH";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Não podem haver caracteres repetidos no alfabeto", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestRepetidoMeioAdjacente(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCDDFGH";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Não podem haver caracteres repetidos no alfabeto", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }

    @org.junit.jupiter.api.Test
    void definirAlfabetoTestRepetidoMeioNaoAdjacente(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCEDEFEGH";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            assertEquals("Não podem haver caracteres repetidos no alfabeto", e.getMessage());
        }
        assertNotEquals(alfabeto, configuracao.getAlfabeto());
    }




}
