package coelho;

import java.util.Scanner;

public class Clientes {
    private String cpf;
    private String nome;
    private Imoveis imovel;
    public Clientes (String nome, String cpf, Imoveis imovel){
        setCpf(cpf);
        this.nome = nome;
        this.imovel = imovel;
    }
    public java.lang.String getCpf() {
        return cpf;
    }
    public java.lang.String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf){
        Scanner sc = new Scanner(System.in);
        if(verificaCpf(cpf)==0){
            do {
                System.out.println("Cpf inválido, tente novamente!!!");
                cpf = sc.nextLine();
            } while ((verificaCpf(cpf) == 0));
        }
        if (verificaCpf(cpf) == 2) {
            cpf = formataCpf(cpf);
        }
        this.cpf = cpf;
    }
    private int verificaCpf(String cpf){
        String aux = apenasNumeral(cpf);
        if (aux.matches("\\d+") && cpf.length()==14 && cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-')
            return 1;

        else {
            if (aux.matches("\\d+") && cpf.length() == 11)
                return 2;
            else
                return 0;
        }
    }
    private String formataCpf(String cpf){
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }
    public static String apenasNumeral(String cpf){
        String aux = cpf.replaceAll("[^0-9]", "");
        return aux;
    }
    public String toString(){
        String str = "\n----------------------------------------------------------------------------------------------";
        return str+"\nCliente:\tNome:\t"+nome+"\t|\tCPF: "+cpf+"\n\t"+imovel.toString();
    }
    public void mostrarCliente(){
        System.out.println(this.toString());
    }
}
