package dados_estatisticos;

import java.util.*;

public class TemperaturasDoPeriodo  implements DadosEstatisticos{
    private List<Double> temperaturasDoPeriodo = new ArrayList<>();

    public void setTemperaturasDoPeriodo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperatura: ");
        double temperatura = sc.nextDouble();
        temperaturasDoPeriodo.add(temperatura);
        sc.close();
    }
    @Override
    public Double maximo() {
        if(temperaturasDoPeriodo.isEmpty())
            return null;
        double tempMax = temperaturasDoPeriodo.get(0);
        for(Double temp:temperaturasDoPeriodo){
            if(temp > tempMax)
                tempMax = temp;
        }
        return tempMax;
    }

    @Override
    public Double minimo() {
        if(temperaturasDoPeriodo.isEmpty())
            return null;
        double tempMin = temperaturasDoPeriodo.get(0);
        for(Double temp:temperaturasDoPeriodo){
            if(temp < tempMin)
                tempMin = temp;
        }
        return tempMin;
    }

    @Override
    public List<Double> ordenar() {
        List<Double> temperaturasOrdenadas = new ArrayList<>(temperaturasDoPeriodo);
        Collections.sort(temperaturasOrdenadas);
        return temperaturasOrdenadas;
    }

    @Override
    public Double buscar(Object temp) {
        for(Double t:temperaturasDoPeriodo){
            if(t.equals(temp))
                return t;
        }
        System.out.println("Temperatura não encontrada");
        return null;
    }
}
