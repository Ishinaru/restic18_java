package manipula_array;

public class MainManipulaArray {
    public static void main(String[] args) {
        ManipulaArray ma = new ManipulaArray();
        ma.criarArrayUsuario();
        ma.criarArrayUsuario();
        ma.criarArrayUsuario();
        System.out.println("Elementos do array: " +ma.getArrayNumero());
        ma.criarArrayAleat();
        ma.criarArrayAleat();
        ma.criarArrayAleat();
        System.out.println("Elementos do array com elementos aleatórios: " +ma.getArrayNumero());
        System.out.println("Soma dos elementos = "+ma.calculaElementos());
        System.out.println("Maior elemento do vetor: "+ma.maiorElemento());
        System.out.println("Menor elemento do vetor: "+ma.menorElemento());
    }
}
