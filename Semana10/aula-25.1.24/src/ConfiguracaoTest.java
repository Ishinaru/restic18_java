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
        String senha = "";
        try{
            configuracao.definirAlfabeto(senha);
    }catch (Exception e){
            assertEquals("Alfabeto não pode ser nulo", e.getMessage());
        }

    }
}
