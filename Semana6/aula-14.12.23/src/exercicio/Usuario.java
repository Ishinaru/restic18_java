package exercicio;

public class Usuario {

    private String nome;
    private String senha;

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String mostraUsuario(){
        return "Usuário : "+nome+"\tSenha: "+ senha;
    }
}
