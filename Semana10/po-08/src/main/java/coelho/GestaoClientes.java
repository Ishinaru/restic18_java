package coelho;

import java.util.Scanner;

public class GestaoClientes {
    public static void incluirCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("\t\t INCLUIR CLIENTE \t\t");
        System.out.println("----------------------------------");
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
    }
}
