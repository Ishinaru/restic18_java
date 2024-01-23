package po07.parte2;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import po07.parte1.Estudante;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainExercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = sc.nextLine();
        List<Estudante> estudantes = lerJson(nomeArquivo);

        for (Estudante estudante : estudantes){
            System.out.println("Nome: "+estudante.getNome());
            System.out.println("CPF: "+estudante.getCpf());
            System.out.println("CRA: "+estudante.getCRA());
            System.out.println("Ano de Admissão: "+estudante.getAnoDeAdmissao());
            System.out.println("--------------------------------------------");
        }
        sc.close();

    }
    public static List<Estudante> lerJson(String nomeArquivo){
        List <Estudante> estudantes = new ArrayList<>();

        try (FileReader fr = new FileReader(nomeArquivo)){
            JSONTokener tokener = new JSONTokener(fr);
            JSONArray jsonArray = new JSONArray(tokener);

            for (Object obj : jsonArray){
                JSONObject jsonObject = (JSONObject) obj;
                String nome = jsonObject.getString("nome");
                String cpf = jsonObject.getString("cpf");
                float cra = jsonObject.getFloat("cra");
                int anoDeAdmissao = jsonObject.getInt("anoDeAdmissao");

                Estudante estudante = new Estudante(nome, cpf, cra, anoDeAdmissao);
                estudantes.add(estudante);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return estudantes;
    }
}

