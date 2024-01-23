package exercicio;

public class Main {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("José", "senha123");
        Usuario u2 = new Usuario("Igor", "senha123");
        Usuario u3 = new Usuario("Bia", "senha123");
        Usuario u4 = new Usuario("Kainê", "senha123");
        Usuario u5 = new Usuario("Ian", "eusoutroxa123");
        ImplementaUsuario lista = new ImplementaUsuario();
        lista.addUsuario(u1);
        lista.addUsuario(u2);
        lista.addUsuario(u3);
        lista.addUsuario(u4);
        lista.addUsuario(u5);

        int x = 2, y = 5;

        lista.listar();
        System.out.println("------------------------------");
        lista.listar(x);
        System.out.println("------------------------------");
        lista.listar(x, y);
    }

}
