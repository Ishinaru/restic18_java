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
        String str = "\n------------------------------------------------------------------------------------";
        return "Cobrador:\t"+super.toString()+ "\n\t\t\t\tID do Cobrador: "+idCobrador+str;
    }

    public void printCobrador(){
        System.out.println(this.toString());
    }
}
