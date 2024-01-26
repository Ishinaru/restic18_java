package configuracao;

import java.util.HashSet;
import java.util.Set;

public class Configuracao {
    private String nome;
    private String alfabeto;
    private int tamanhoSenha;
    private int maxTentativas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlfabeto() {
        return alfabeto;
    }

    public void definirAlfabeto(String alfabeto) throws Exception{
        if(alfabeto == null || alfabeto.isEmpty()){
            throw new Exception("Alfabeto não pode ser vazio ou nulo");
        }
        else if(alfabeto.length() < 2){
            throw new Exception("O alfabeto deve possuir mais de 1 caracter");
        }
        else if(verificaRepeticao(alfabeto)){
            throw new Exception("Não podem haver caracteres repetidos no alfabeto");
        }
        else
            this.alfabeto = alfabeto;
    }

    public void setTamanhoSenha(int tamanhoSenha) throws Exception{
        if(tamanhoSenha < 1){
            throw new Exception("Senha deve ter ao menos 1 caracter");
        }
        else if(tamanhoSenha > alfabeto.length()){
            throw new Exception("Senha não pode ser maior que o alfabeto : "+alfabeto.length()+" caracteres");
        }
        else
            this.tamanhoSenha = tamanhoSenha;
    }

    public int getTamanhoSenha() {
        return tamanhoSenha;
    }

    public void setMaxTentativas(int maxTentativas) throws Exception{
        if(maxTentativas < 1){
            throw new Exception("Deve haver pelo menos 1 tentativa");
        }

        this.maxTentativas = maxTentativas;
    }

    protected boolean verificaRepeticao(String alfabeto){
        Set<Character> caracteres = new HashSet<>();
        for (char c : alfabeto.toCharArray()){
            if (!caracteres.add(c)){
                return true;
            }
        }
        return false;
    }
}
