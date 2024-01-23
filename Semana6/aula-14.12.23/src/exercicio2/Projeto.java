package exercicio2;

public class Projeto {
    private int cod;
    private String nome;
    private double orcamento = 0;
    private Engenheiro eng_resp;
    public Projeto(int cod, String nome) {
        this.nome = nome;
        this.cod = cod;
    }

    public Projeto(int cod, String nome, double orcamento) {
        this.nome = nome;
        this.cod = cod;
        this.orcamento = orcamento;
    }

    public Projeto(int cod, String nome, double orcamento, Engenheiro eng_resp) {
        this.nome = nome;
        this.cod = cod;
        this.orcamento = orcamento;
        this.eng_resp = eng_resp;
    }

    public void mostraProjeto(){
        if(orcamento == 0 && eng_resp == null)
            System.out.println("Nome: "+ nome +"\nCod: "+cod);
        else if(orcamento!=0 && eng_resp == null)
            System.out.println( "Nome: "+ nome +"\nCod: "+cod+"\nOrçamento: "+orcamento);
        else
            System.out.println( "Nome: "+ nome +"\nCod: "+cod+"\nOrçamento: "+orcamento+"\nEngenheiro: "+eng_resp.mostraEngenheiro());
    }

}
