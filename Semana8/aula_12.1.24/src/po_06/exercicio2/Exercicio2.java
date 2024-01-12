package po_06.exercicio2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File arquivo = new File("src/po_06/exercicio2/saida.txt");
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        String linha;
        System.out.println("Digite as linhas de texto <espaço em branco parar>: ");
        do{
            linha = sc.nextLine();
            bw.write(linha);
            bw.newLine();
        }while (!linha.isEmpty());

        sc.close();
        bw.close();
        fw.close();
    }
}
