package po_06.exercicio3;

import java.io.*;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {
        File arquivoOrigem = new File("src/po_06/exercicio3/origem.txt");
        File arquivoDestino = new File("src/po_06/exercicio3/destino.txt");

        FileWriter fwOrigem =  new FileWriter(arquivoOrigem);
        FileWriter fwDestino =  new FileWriter(arquivoDestino);
        BufferedWriter bwOrigem = new BufferedWriter(fwOrigem);
        BufferedWriter bwDestino = new BufferedWriter(fwDestino);

        FileReader frOrigem = new FileReader(arquivoOrigem);
        FileReader frDestino = new FileReader(arquivoDestino);
        BufferedReader brOrigem = new BufferedReader(frOrigem);
        BufferedReader brDestino = new BufferedReader(frDestino);

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva as linhas do arquivo de origem: ");


        fwOrigem.close();
        frOrigem.close();
        bwOrigem.close();
        bwDestino.close();

        frDestino.close();
        fwDestino.close();
        brOrigem.close();
        brDestino.close();

        sc.close();
    }
}
