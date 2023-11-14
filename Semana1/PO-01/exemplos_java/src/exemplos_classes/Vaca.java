package exemplos_classes;

public class Vaca extends Animal{
    private String nome;

    Vaca(){
        this.nome = "Vaca Padrão";
    }

    Vaca(String nome){
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
        System.out.println("A vaca "+nome+" está fazendo som!!!");
        System.out.println("Muu!!!");
    }
}
