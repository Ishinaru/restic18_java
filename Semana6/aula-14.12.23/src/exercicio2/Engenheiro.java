package exercicio2;

public class Engenheiro {

    private String crea;
    private String nome;

    public Engenheiro(String crea, String nome) {
        this.crea = crea;
        this.nome = nome;
    }

    public String mostraEngenheiro(){
        return "Engenheiro: "+ nome + "\tCREA: "+crea;
    }
}
