package configuracao;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @org.junit.jupiter.api.Test
    void definirAlfabeto() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCDEFGH";
        try {
            configuracao.definirAlfabeto(alfabeto);
        } catch (Exception e) {
            fail("Gerou exceção indevida: "+e.getMessage());
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
    @org.junit.jupiter.api.Test
    void setTamanhoSenhaTest(){
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        try{
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            e.printStackTrace();
        }
        //caso geral: tamanho de senha válido(entre 1 e 4)
        Random rand = new Random();
        int tam = rand.nextInt(1,5);
        System.out.println(tam);
        try {
            configuracao.setTamanhoSenha(tam);
        } catch (Exception e) {
            fail("Gerou exceção indevida: "+e.getMessage());
        }
        assertEquals(tam, configuracao.getTamanhoSenha());
    }

    @org.junit.jupiter.api.Test
    void setTamanhoSenhaTestNegativo() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        try {
            configuracao.definirAlfabeto(alfabeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //caso 1: tamanho de senha negativo
        int tam = -1;
        try {
            configuracao.setTamanhoSenha(tam);
        } catch (Exception e) {
            assertEquals("Senha deve ter ao menos 1 caracter", e.getMessage());
        }
        assertNotEquals(tam, configuracao.getTamanhoSenha());
    }

    @org.junit.jupiter.api.Test
    void setTamanhoSenhaTestIgualZero() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        try {
            configuracao.definirAlfabeto(alfabeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //caso 2: tamanho de senha igual a 0
        int tam = 0;
        try {
            configuracao.setTamanhoSenha(tam);
        } catch (Exception e) {
            assertEquals("Senha deve ter ao menos 1 caracter", e.getMessage());
        }
        assertNotEquals(tam, configuracao.getTamanhoSenha());
    }

    @org.junit.jupiter.api.Test
    void setTamanhoSenhaTestIgualAlfabeto() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        try {
            configuracao.definirAlfabeto(alfabeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //caso 2 versão 2: tamanho de senha igual ao tamanho do alfabeto (4 caracteres)
        int tam = 4;
        try {
            configuracao.setTamanhoSenha(tam);
        } catch (Exception e) {
            fail("Gerou exceção indevida: "+e.getMessage());
        }
        assertEquals(tam, configuracao.getTamanhoSenha());

    }

    @org.junit.jupiter.api.Test
    void setTamanhoSenhaTestMaiorAlfabeto() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        try {
            configuracao.definirAlfabeto(alfabeto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //caso 2 versão 2: tamanho de senha maior que tamanho do alfabeto (4 caracteres)
        int tam = 5;
        try {
            configuracao.setTamanhoSenha(tam);
        } catch (Exception e) {
            assertEquals("Senha não pode ser maior que o alfabeto : "+alfabeto.length()+" caracteres", e.getMessage());
        }
        assertNotEquals(tam, configuracao.getTamanhoSenha());
    }

    @org.junit.jupiter.api.Test
    void setMaxTentativaTest() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        int tam = 4;
        try {
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            fail("Gerou exceção indevida: "+e.getMessage());
        }

        try {
            configuracao.setTamanhoSenha(tam);
        }catch (Exception e){
            fail("Gerou exceção indevida: "+e.getMessage());
        }
        int tentativas = 2;
        try {
            configuracao.setMaxTentativas(tentativas);
        }catch (Exception e){
            fail("Gerou exceção indevida: "+e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void setMaxTentativaTestNegativo() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        int tam = 4;
        try {
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            fail("Gerou exceção indevida: "+e.getMessage());
        }

        try {
            configuracao.setTamanhoSenha(tam);
        }catch (Exception e){
            fail("Gerou exceção indevida: "+e.getMessage());
        }
        int tentativas = -1;
        try {
            configuracao.setMaxTentativas(tentativas);
        }catch (Exception e){
            assertEquals("Deve haver pelo menos 1 tentativa", e.getMessage());
        }
        assertNotEquals(tentativas, configuracao.getMaxTentativas());
    }

    @org.junit.jupiter.api.Test
    void setMaxTentativaTestZero() {
        Configuracao configuracao = new Configuracao();
        String alfabeto = "ABCD";
        int tam = 4;
        try {
            configuracao.definirAlfabeto(alfabeto);
        }catch (Exception e){
            fail("Gerou exceção indevida: "+e.getMessage());
        }

        try {
            configuracao.setTamanhoSenha(tam);
        }catch (Exception e){
            fail("Gerou exceção indevida: "+e.getMessage());
        }
        int tentativas = 0;
        try {
            configuracao.setMaxTentativas(tentativas);
        }catch (Exception e){
            assertEquals("Deve haver pelo menos 1 tentativa", e.getMessage());
        }
        assertNotEquals(tentativas, configuracao.getMaxTentativas());
    }

}
