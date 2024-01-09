package exercicio_crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuarios {
    private List<Usuario> listaUsuarios = new ArrayList<>();
    public void inserirUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Nacionalidade: ");
        String nac = sc.nextLine();
        Usuario user = new Usuario(nome, email, nac);
        listaUsuarios.add(user);
        sc.close();
    }
    public Usuario buscarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o email do usuário a ser encontrado: ");
        String email = sc.nextLine();
        for(Usuario usuario:listaUsuarios){
            if(usuario.getEmail().equals(email)){
                System.out.println("Usuário encontrado!");
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado!");
        return null;
    }

    public void listarUsuarios(){
        for(Usuario user:listaUsuarios){
            user.mostrarUsuario();
            System.out.println("----------------------");
        }
    }

    public void excluirUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o email do usuário a ser excluido: ");
        String email = sc.nextLine();
        for (Usuario usuario: listaUsuarios){
            if (usuario.getEmail().equals(email)){
                listaUsuarios.remove(usuario);
                System.out.println("Usuário removido com sucesso!");
            }
        }
    }

}
