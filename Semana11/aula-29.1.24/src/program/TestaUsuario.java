package program;

import dao.UsuarioDAO;
import usuario.Usuario;

import java.util.ArrayList;

public class TestaUsuario {
    public static void main(String[] args) {
        /* Insert
        Usuario usuario = new Usuario();
        usuario.setLogin("Ishinaru");
        usuario.setSenha("senhateste");
        usuario.setEmail("ishinaru");
        UsuarioDAO.create(usuario);
        */

        /* Select todos os usuarios
        ArrayList<Usuario> usuarios = UsuarioDAO.readAll();
        for (Usuario usuario : usuarios){
            System.out.println(usuario.getLogin());
            System.out.println(usuario.getSenha());
            System.out.println(usuario.getEmail());
            System.out.println("============================");
        }
        */

        Usuario user = UsuarioDAO.readById("Ishinaru");
        System.out.println(user.getLogin());
        System.out.println(user.getSenha());
        System.out.println(user.getEmail());
    }
}
