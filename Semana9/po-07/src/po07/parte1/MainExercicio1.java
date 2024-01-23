package po07.parte1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

public class MainExercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estudante> estudantes = new ArrayList<>();
        char resposta;

        do{
            System.out.print("Nome do Estudante: ");
            String nome = sc.nextLine();

            System.out.print("Cpf do Estudante: ");
            String cpf = sc.nextLine();

            System.out.print("CRA do Estudante: ");
            float cra = sc.nextFloat();
            sc.nextLine();

            System.out.print("Ano de Admissão do Estudante: ");
            int anoAdmissao = sc.nextInt();
            sc.nextLine();

            Estudante estudante = new Estudante(nome, cpf, cra, anoAdmissao);
            estudantes.add(estudante);

            System.out.println("Deseja continuar? <S/s>SIM | <N>NÃO");
            resposta = sc.next().charAt(0);
            sc.nextLine();
        }while (resposta == 'S' || resposta == 's');

        try (FileWriter fw  = new FileWriter("estudantes.json")){

        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo JSON");
        }

        sc.close();

        gravarEmJson(estudantes, "estudantes.json");
    }
    public static void gravarEmJson(List<Estudante> estudantes, String nomeArquivo){
        JSONArray ja = new JSONArray();
        for (Estudante estudante : estudantes){
            JSONObject estudanteJson = new JSONObject();
            estudanteJson.put("nome", estudante.getNome());
            estudanteJson.put("cpf", estudante.getCpf());
            estudanteJson.put("cra", estudante.getCRA());
            estudanteJson.put("anoDeAdmissao", estudante.getAnoDeAdmissao());

            ja.put(estudanteJson);
        }

        try (FileWriter fw = new FileWriter(nomeArquivo)) {
            fw.write(ja.toString());
            System.out.println("Dados dos estudantes foram gravados no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo JSON");
            e.printStackTrace(); // Mostrar detalhes do erro no console
        }

    }

}
