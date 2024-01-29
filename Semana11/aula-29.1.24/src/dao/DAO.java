package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private static final String URL = "jdbc:mysql://uu3vun18liwwkjwh:zvCEtHpzXKerU2yI0HAU@bhhp0ojrrzhhxw6t4gya-mysql.services.clever-cloud.com:3306/bhhp0ojrrzhhxw6t4gya";
    private static final String USER = "uu3vun18liwwkjwh";
    private static final String PASSWD ="zvCEtHpzXKerU2yI0HAU";
    public static Connection conectar(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(URL, USER, PASSWD);
            System.out.println("Conexão feita com sucesso!!!!");
        }   catch (SQLException e){
            System.out.println("Erro de conexão");
        }
        return con;
    }

    public static void main(String[] args) {
        DAO.conectar();

    }
}