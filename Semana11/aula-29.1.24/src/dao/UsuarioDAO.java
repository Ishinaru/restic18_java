package dao;

import usuario.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    public static boolean create(Usuario usuario) {
        Connection conn = DAO.conectar();
        String query = "INSERT INTO Usuario (Login, Senha, Email)\n" +
                "VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getEmail());
            System.out.println(ps.toString());
            ps.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
