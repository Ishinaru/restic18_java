package coelho;

import java.util.ArrayList;
import java.util.List;

public class Imoveis {
    private static int proxMatricula = 1;
    private String matricula;
    private String endereco;
    private double penultimaLeitura;
    private double ultimaLeitura;

    public Imoveis(java.lang.String endereco, double penultimaLeitura, double ultimaLeitura) {
        setMatricula();
        this.endereco = endereco;
        this.penultimaLeitura = penultimaLeitura;
        this.ultimaLeitura = ultimaLeitura;
    }

    public String getMatricula() {
        return matricula;
    }

    private void setMatricula(){
        this.matricula = String.format("%07d", proxMatricula);
        proxMatricula++;
    }

    public String toString(){
        String str = "\n----------------------------------------------------------------------------------------------";
        return "Imóvel:\n\tNúmero de Matrícula: "+matricula+"\t|\tEndereço: "+endereco+"\n\tPenúltima Leitura: "+penultimaLeitura+" KWh\t" +
                "|\tÚltima Leitura: "+ultimaLeitura+" KWh"+str;
    }

    public void mostrarImovel(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        List<Imoveis> lista = new ArrayList<>();

        Imoveis i1 = new Imoveis("Rua A", 100, 200);
        Imoveis i2 = new Imoveis("Rua B", 150, 250);
        Imoveis i3 = new Imoveis("Rua C", 200, 300);
        Imoveis i4 = new Imoveis("Rua D", 250, 350);
        Imoveis i5 = new Imoveis("Rua E", 300, 400);

        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        lista.add(i4);
        lista.add(i5);

        for(Imoveis i : lista){
            i.mostrarImovel();
        }
    }
}
