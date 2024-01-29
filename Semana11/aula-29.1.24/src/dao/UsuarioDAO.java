package dao;

import usuario.Usuario;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    public static ArrayList<Usuario> readAll(){
        Connection conn = DAO.conectar();
        String query = "SELECT Login, Senha, Email FROM Usuario";
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try{
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs =  ps.executeQuery();
            while (rs.next()){
                Usuario usuario = new Usuario();
                usuario.setLogin(rs.getString("Login"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setEmail(rs.getString("Email"));
                listaUsuarios.add(usuario);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listaUsuarios;
    }

}
