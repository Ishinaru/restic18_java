package exemplos_classes;

public class Porco extends Animal {
    private String nome;

    Porco(){
        this.nome = "Porco Padrão";
    }

    Porco(String nome){
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
        System.out.println("O porco "+nome+" está fazendo som!!!");
        System.out.println("Oinc Oinc!!!");
    }
}
