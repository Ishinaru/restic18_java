package dados_estatisticos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CidadesDoBrasil implements DadosEstatisticos{
    private List<String> cidadesDoBrasil = new ArrayList<>();

    public void setCidadesDoBrasil(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome da Cidade: ");
        String cidade = sc.nextLine();
        cidadesDoBrasil.add(cidade);
        sc.close();
    }
    @Override
    public String maximo() {
        return this.ordenar().get(this.cidadesDoBrasil.size());
    }

    @Override
    public Object minimo() {
        return this.ordenar().get(0);
    }

    @Override
    public List<String> ordenar() {
        List <String> cidadesDoBrasilOrdenadas = new ArrayList<>(cidadesDoBrasil);
        Collections.sort(cidadesDoBrasilOrdenadas);
        return cidadesDoBrasilOrdenadas;
    }

    @Override
    public Object buscar(Object o) {
        return null;
    }
}
