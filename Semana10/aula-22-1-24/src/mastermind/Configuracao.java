package mastermind;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Configuracao {
    private String nome;
    private String alfabeto;
    private int tamanhoSenha;
    private int maxTentativas;

    public boolean temRepeticoes(String alfabeto){
        Set<Character> caracteres = new HashSet<>();
        for (char c : alfabeto.toCharArray()){
            if (!caracteres.add(c)){
                return true;
            }
        }
        return false;
    }
    public void definirAlfabeto(String alfabeto){
        if(!alfabeto.isEmpty() && alfabeto != null & !temRepeticoes(alfabeto)){
            this.alfabeto = alfabeto;
        }
        else
            System.out.println("O alfabeto não pôde ser definido");

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanhoSenha(int tamanhoSenha) {
        this.tamanhoSenha = tamanhoSenha;
    }

    public void setMaxTentativas(int maxTentativas) {
        this.maxTentativas = maxTentativas;
    }

    public static void main(String[] args) {
        Configuracao config = new Configuracao();
        config.setNome("Configuração 1");
        config.definirAlfabeto("ABC");
        System.out.println(config.getNome());
    }
}
