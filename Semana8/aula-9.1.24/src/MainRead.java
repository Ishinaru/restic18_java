import java.io.*;
import java.util.Scanner;

public class MainRead {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String nomeArquivo = "C:/Users/00989352595/IdeaProjects/aula-09.1.24/src/" + sc.nextLine();
        FileReader fr = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha;
        while (br.ready()){
            linha = br.readLine();
            System.out.println(linha);
        }
        fr.close();
        br.close();
    }
}
