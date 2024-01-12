package po_06.exercicio4;

public class Cobrador extends Pessoa{
    private static int proxIdCobrador = 1;
    private int idCobrador;

    public Cobrador(String nome, String cpf) {
        super(nome, cpf);
        this.idCobrador = proxIdCobrador++;
    }

    public int getIdCobrador() {
        return idCobrador;
    }

    public String toString(){
        return super.toString()+ "\nID do Cobrador: "+idCobrador;
    }

    public void printCobrador(){
        System.out.println(this.toString());
    }
}
