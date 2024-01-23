import java.util.List;
public class Cobradores extends Pessoa{
    private static proxIdCobrador = 1;
    private int idCobrador;

    public Cobradores(String nome, String cpf) {
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