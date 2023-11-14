package exemplos_classes;

public class Cachorro extends Animal {
    private String nome;

    Cachorro(){
        this.nome = "Cachorro Padrão";
    }

    Cachorro(String nome){
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
        System.out.println("O cachorro "+nome+" está fazendo som!!!");
        System.out.println("AuAu!!!");
    }
}
