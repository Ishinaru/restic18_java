package coelho;

import java.util.Scanner;

public class Clientes {
    private String cpf;
    private String nome;

    public Clientes (String nome, String cpf){
        setCpf(cpf);
        this.nome = nome;
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
    public void setNome(Scanner sc) {
        this.nome = sc.toString();
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

    public void setCpf(Scanner sc){
        String cpf;
        if(verificaCpf(sc.toString())==0){
            do {
                System.out.println("Cpf inválido, tente novamente!!!");
                cpf = sc.nextLine();
            } while ((verificaCpf(cpf) == 0));
        }
        if (verificaCpf(sc.toString()) == 2) {
            cpf = formataCpf(sc.toString());
        }
        this.cpf = sc.toString();
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
        String str = "Cliente:\tNome: "+nome+"\t|\tCPF: "+cpf;
        return str;
    }

    public void mostrarCliente(){
        System.out.println(this.toString());
    }


}
