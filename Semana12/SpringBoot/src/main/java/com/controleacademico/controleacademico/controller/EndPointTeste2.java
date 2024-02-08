package com.controleacademico.controleacademico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;

@Controller
public class EndPointTeste2 {
    @RequestMapping("/david1")
    @ResponseBody
    public String mensagem(){
        return "JÚPITER";
    }

    @RequestMapping("/david")
    @ResponseBody
    public String mensagem1(){
        String str = "";
        for (int i = 0 ; i < 1000; i++)
            str += "JÚPITER\n";
        return str;
    }

    @RequestMapping("/txt")
    @ResponseBody
    public String testeTxt() throws IOException {

        File arquivo = new File("texto.txt");
        String str = "";

            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            while (br.ready()){
                str += br.readLine()+"\n\n\n\n\n\n\n\n\n\n";

            }

        br.close();
        fr.close();
        return str;
    }
}

