package exemplos_classes;

public class Gato extends Animal{
    private String nome;

    Gato(){
        this.nome = "Gato Padrão";
    }

    Gato(String nome){
        this.nome = nome;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void fazerSom() {
        System.out.println("O Gato "+nome+" está fazendo som!!!");
        System.out.println("Miau!!!");
    }
}
