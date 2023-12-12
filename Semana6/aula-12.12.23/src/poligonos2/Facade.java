package poligonos2;


import java.util.Scanner;

class Facade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Poligono de quantos pontos? ");
        int n = sc.nextInt();

        Poligono poli = new Poligono();
        for (int i = 0; i < n; i++) {
            Ponto p = Ponto.solicitaPonto();
            p.mostraPonto();
            poli.inserePonto(p);
        }
        System.out.println("Todos os pontos: ");
        poli.monstraPontos();
        System.out.println("Mostrando o perimetro: " + poli.perimetro());
    }
}


