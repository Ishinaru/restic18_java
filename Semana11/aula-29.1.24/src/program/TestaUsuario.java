package program;

import dao.UsuarioDAO;
import usuario.Usuario;

public class TestaUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setLogin("Ishinaru");
        usuario.setSenha("senhateste");
        usuario.setEmail("ishinaru");
        UsuarioDAO.create(usuario);
    }
}
