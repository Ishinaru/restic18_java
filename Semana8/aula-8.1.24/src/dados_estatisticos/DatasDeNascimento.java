package dados_estatisticos;
import java.util.*;

public class DatasDeNascimento implements DadosEstatisticos{
    private List <Date> datasNascimento = new ArrayList<>();

    public void setDataNascimento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dia de nascimento: ");
        int dia = sc.nextInt();
        System.out.println("Mês de nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Ano de nascimento: ");
        int ano = sc.nextInt();
        Date data = new Date(ano, mes, dia);
        datasNascimento.add(data);
        sc.close();

    }
    @Override
    public Date maximo() {
        if (datasNascimento.isEmpty())
            return null;

        Date dataMaxima = datasNascimento.get(0);

        for(Date data: datasNascimento){
            if(data.compareTo(dataMaxima) > 0)
                dataMaxima = data;
        }
        return dataMaxima;
    }

    @Override
    public Date minimo() {
        if (datasNascimento.isEmpty())
            return null;

        Date dataMinima = datasNascimento.get(0);

        for (Date data : datasNascimento) {
            if (data.compareTo(dataMinima) < 0) {
                dataMinima = data;
            }
        }

        return dataMinima;
    }
    @Override
    public List<Date> ordenar() {
        List<Date> datasOrdenadas = new ArrayList<>(datasNascimento);
        Collections.sort(datasOrdenadas);
        return datasOrdenadas;
    }

    @Override
    public Date buscar(Object data) {
        for(Date d: datasNascimento){
            if(d.equals(data))
                return (Date) data;
        }
        System.out.println("Data não encontrada");
        return null;
    }
}
