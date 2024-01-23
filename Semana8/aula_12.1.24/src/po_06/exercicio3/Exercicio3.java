package po_06.exercicio3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws IOException {
        File arquivoOrigem = new File("src/po_06/exercicio3/origem.txt");
        File arquivoDestino = new File("src/po_06/exercicio3/destino.txt");

        FileWriter fwOrigem =  new FileWriter(arquivoOrigem);
        FileWriter fwDestino =  new FileWriter(arquivoDestino);
        BufferedWriter bwOrigem = new BufferedWriter(fwOrigem);
        BufferedWriter bwDestino = new BufferedWriter(fwDestino);



        Scanner sc = new Scanner(System.in);
        String linha;

        System.out.println("Escreva as linhas do arquivo de origem <linha em branco - sair>: ");

        do {
            linha = sc.nextLine();
            bwOrigem.write(linha);
            bwOrigem.newLine();
        } while (!linha.isEmpty());

        bwOrigem.close();
        fwOrigem.close();

        FileReader frOrigem = new FileReader(arquivoOrigem);
        BufferedReader brOrigem = new BufferedReader(frOrigem);

        while(brOrigem.ready()){
            linha = brOrigem.readLine();
            bwDestino.write(linha);
            bwDestino.newLine();
        }

        brOrigem.close();
        frOrigem.close();
        bwDestino.close();
        fwDestino.close();
    }
}
