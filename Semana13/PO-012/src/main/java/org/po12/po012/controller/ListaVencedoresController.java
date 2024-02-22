package org.po12.po012.controller;

import org.po12.po012.model.ListaVencedores;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class ListaVencedoresController {
    private List<ListaVencedores> listaVencedores = new ArrayList<>();

    public ListaVencedoresController(){
        coverterCSV("src/main/resources/data/pilotos.csv");
    }
    @RequestMapping("/todos")
    public List<ListaVencedores> listarVencedores(){
        return listaVencedores;
    }
    @RequestMapping("/brasileiros")
    public List<ListaVencedores> listarBrasileiros(){
        List<ListaVencedores> listaBrasileiros = new ArrayList<>();
        for (ListaVencedores vencedores: listaVencedores){
            if(vencedores.getPais().equals("Brasil"))
                listaBrasileiros.add(vencedores);
        }
        return listaBrasileiros;
    }
    @RequestMapping("/top5")
    public List<ListaVencedores> listarTop5(){
        List<ListaVencedores> listaTop5 = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            listaTop5.add(listaVencedores.get(i));
        }
        return listaTop5;
    }
    @RequestMapping("/top10")
    public List<ListaVencedores> listarTop10(){
        List<ListaVencedores> listaTop10 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            listaTop10.add(listaVencedores.get(i));
        }
        return listaTop10;
    }

    @RequestMapping("/porpais")
    public List<ListaVencedores> listarPorPais(){
        List<ListaVencedores> listaPorPais = new ArrayList<>(listaVencedores);
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(Collator.PRIMARY);
        try {
            listaPorPais.sort((pais1, pais2) -> collator.compare(pais1.getPais(), pais2.getPais()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return listaPorPais;
    }

    @RequestMapping("/mediaporpais")

    public Map<String, Double> listarMediaPorPais(){
        Collator collator = Collator.getInstance(Locale.getDefault());
        collator.setStrength(Collator.PRIMARY);
        Map<String, Double> listaMediaPorPais = new TreeMap<>(collator);
        listaMediaPorPais.putAll(listaVencedores.stream().collect(Collectors.groupingBy(ListaVencedores::getPais,
                Collectors.averagingDouble(ListaVencedores::getVitorias))));
        return listaMediaPorPais;
    }

    public void coverterCSV(String nomeArquivo){
        File arquivo = new File(nomeArquivo);
        try {
            BufferedReader br = new BufferedReader(new FileReader(arquivo));
            br.readLine();
            while (br.ready()){
                String linha = br.readLine();
                String[] dadosCSV = linha.split(";");
                listaVencedores.add(new ListaVencedores(dadosCSV[0],dadosCSV[1],Integer.parseInt(dadosCSV[2])));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
