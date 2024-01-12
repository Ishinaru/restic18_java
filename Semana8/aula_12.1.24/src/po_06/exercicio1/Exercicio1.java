package po_06.exercicio1;

import java.io.*;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("src/po_06/exercicio1/entrada.txt");
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        while(br.ready()){
            String linha = br.readLine();
            System.out.println(linha);
        }
    }


}
