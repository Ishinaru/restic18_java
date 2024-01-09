import java.io.*;
import java.util.Scanner;

public class MainWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String nomeArquivo = "C:/Users/00989352595/IdeaProjects/aula-09.1.24/src/" +  sc.nextLine();
        File arquivo = new File(nomeArquivo);
        arquivo.createNewFile();
        System.out.print("Digite uma linha de texto: ");
        String txt = sc.nextLine();
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(txt);
        while(!txt.isEmpty()){
            System.out.print("Digite uma linha de texto: ");
            txt = sc.nextLine();
            bw.newLine();
            bw.write(txt);
        }

        bw.close();
        fw.close();
    }
}