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

    public void definirAlfabeto(String alfabeto){
        if(!alfabeto.isEmpty() && !verificaRepeticao(alfabeto))
            this.alfabeto = alfabeto;

        else if (alfabeto.length()<2){
            System.out.println("O alfabeto deve possuir mais de 1\n" +
                    "caracter");
        }

        else
            System.out.println("O alfabeto não pode ser vazio nem conter repetições");
    }

    public void setTamanhoSenha(int tamanhoSenha) {
        this.tamanhoSenha = tamanhoSenha;
    }

    public void setMaxTentativas(int maxTentativas) {
        this.maxTentativas = maxTentativas;
    }

    public boolean verificaRepeticao(String alfabeto){
        Set<Character> caracteres = new HashSet<>();
        for (char c : alfabeto.toCharArray()){
            if (!caracteres.add(c)){
                return true;
            }
        }
        return false;
    }
}
