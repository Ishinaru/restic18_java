public class Veiculo{
    private static int proxVeiculo = 1;
    private int idVeiculo;
    private String modelo;
    private String placa;
    private List<PontoParada> pontosEstacionados;

    public Veiculo(String placa, String modelo){
        this.placa = placa;
        this.modelo = modelo;
        this.pontosEstacionados = new ArrayList<>();
        this.idVeiculo = proxVeiculo++;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }

    public int getIdVeiculo(){
        return idVeiculo;
    }

    public List<PontoParada> getPontosEstacionados(){
        return pontosEstacionados;
    }   

    public void estacionar(PontoParada parada){
        pontosEstacionados.add(parada);
    }

}