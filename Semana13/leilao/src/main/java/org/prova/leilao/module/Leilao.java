package org.prova.leilao.module;

public class Leilao {
    private Long id;
    private String descricao;
    private Double valorMaximo;
    private boolean aberto;
    public Leilao() {
    }
    public Leilao(Long id, String descricao, Double valorMaximo) {
        this.id = id;
        this.descricao = descricao;
        this.valorMaximo = valorMaximo;
        this.aberto = true;
    }
    public String toString(){
        if(this.aberto)
            return "Leilão nº "+id+"\n" +
                    "Descrição: "+descricao+"\n"+
                    "Valor Máximo: "+valorMaximo+"\n" +
                    "Status: Aberto";
        else
            return "Leilão nº "+id+"\n" +
                    "Descrição: "+descricao+"\n"+
                    "Valor Máximo: "+valorMaximo+"\n" +
                    "Status: Fechado";
    }
    public void mostrarLeilao(){
        System.out.println(toString());
    }
}
