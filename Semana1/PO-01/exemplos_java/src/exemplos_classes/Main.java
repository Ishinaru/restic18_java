package exemplos_classes;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Max");
        a1.fazerSom();

        Cachorro a2 = new Cachorro("Max");
        a2.fazerSom();

        Gato a3 = new Gato("Juma");
        a3.fazerSom();

        Porco a4 = new Porco();
        a4.fazerSom();

        Vaca a5 = new Vaca("Mimosa");
        a5.fazerSom();
    }
}
