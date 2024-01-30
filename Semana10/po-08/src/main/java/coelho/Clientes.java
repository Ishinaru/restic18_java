package coelho;

public class Clientes {
    private String cpf;
    private String nome;

    public Clientes (String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String toString(){
        String str = "Cliente:\tNome: "+nome+"\t|\tCPF: "+cpf;
        return str;
    }

    public void mostrarCliente(){
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Clientes cliente = new Clientes("David", "111-222-333-44");
        cliente.mostrarCliente();
    }
}
