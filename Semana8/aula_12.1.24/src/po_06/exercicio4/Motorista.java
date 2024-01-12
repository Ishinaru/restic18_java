package po_06.exercicio4;

public class Motorista extends Pessoa{
    private static int proxIdMotorista = 1;
    private int idMotorista;

    public Motorista(String nome, String cpf) {
        super(nome, cpf);
        this.idMotorista = proxIdMotorista++;
    }

    public int getIdMotorista() {
        return idMotorista;
    }

    public String toString(){
        return super.toString()+ "\nID do Motorista: "+idMotorista;
    }

    public void printMotorista(){
        System.out.println(this.toString());
    }

}
