package org.prova.leilao.module;

public class Lance {
    private Long id;
    private Leilao leilaoAssociado;
    private Concorrente concorrenteAssociado;
    private Double valor;
    public Lance() {
    }
    public Lance(Long id, Leilao leilaoAssociado, Concorrente concorrenteAssociado, Double valor) {
        this.id = id;
        this.leilaoAssociado = leilaoAssociado;
        this.concorrenteAssociado = concorrenteAssociado;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Leilao getLeilaoAssociado() {
        return leilaoAssociado;
    }

    public void setLeilaoAssociado(Leilao leilaoAssociado) {
        this.leilaoAssociado = leilaoAssociado;
    }

    public Concorrente getConcorrenteAssociado() {
        return concorrenteAssociado;
    }

    public void setConcorrenteAssociado(Concorrente concorrenteAssociado) {
        this.concorrenteAssociado = concorrenteAssociado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Lance nº " + id + "\n" +
                "Leilão associado: " + leilaoAssociado.toString() + "\n" +
                "Concorrente: " + concorrenteAssociado.toString() + "\n" +
                "Valor: " + valor;
    }

    public void mostrarLance(){
        System.out.println(toString());
    }

}
