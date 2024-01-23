package exercicio2;

public class Main {
    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("12345678", "Paulocitos");
        Engenheiro eng2 = new Engenheiro("45782564", "Rock Balboa");
        Engenheiro eng3 = new Engenheiro("87654321", "Kleiton");
        Engenheiro eng4 = new Engenheiro("00010100", "Salah");

        Projeto p1 = new Projeto(12345678,"Projeto de merda");
        Projeto p2 = new Projeto(11111111,"Projeto de desgraça", 800000.00);
        Projeto p3 = new Projeto(22222222,"Projeto BOMBA ATOMICA", 100000000.00,eng1);

        p1.mostraProjeto();
        System.out.println("------------------------------");
        p2.mostraProjeto();
        System.out.println("------------------------------");
        p3.mostraProjeto();
    }
}
