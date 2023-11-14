package exemplos_classes;

public class Animal {
    private String nome;

    Animal(){
        this.nome = "Padrão";
    }

    Animal(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void fazerSom(){
        System.out.println("O animal " + nome + " está fazendo som!!!");
    }

}
