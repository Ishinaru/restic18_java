package exercicio_veiculo;

public class Main {
    public static void main(String[] args) {
        Carro car1 = new Carro("Audi","preta",2022);
        Carro car2 = new Carro("Fusca","branco",1980,4);
        Caminhao cam1 = new Caminhao("Volvo FH-540","cinza",2022);
        Caminhao cam2 = new Caminhao("Scania P-310","vermelho",2015, 4);
        Caminhao cam3 = new Caminhao("Volvo VM 330","branco",2015, 2, 1000.00);

        car1.mostraInfos();
        System.out.println("-----------------------");
        car2.mostraInfos();
        System.out.println("-----------------------");
        cam1.mostraInfos();
        System.out.println("-----------------------");
        cam2.mostraInfos();
        System.out.println("-----------------------");
        cam3.mostraInfos();

    }
}
