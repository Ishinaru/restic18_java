package aula_19_12_23.exercicio3;

import java.math.BigInteger;

public class Membro {
    private static int num;
    private String nome;
    private String num_identificacao;

    public Membro(String nome){
       this.nome = nome;
    }

    private String criarNumIdentificacao(){
        StringBuilder sb = new StringBuilder();
        for(char c: nome.toCharArray())
            sb.append((int)c);
        BigInteger n = new BigInteger(sb.toString());
        num++;
        String nomeformatado = nomeformatado.toString(n+num);
        return n;
    }


}
