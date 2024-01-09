package exercicio_crud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuarios users = new Usuarios();

        do {
            System.out.println( "1 - Inserir Usuário\n" +
                                "2 - Buscar Usuário\n" +
                                "3 - Listar todos os Usuários\n" +
                                "4 - Excluir Usuário\n" +
                                "0 - Sair");
            int resp = sc.nextInt();
            switch(resp){
                case 1:
                    users.inserirUsuario();
                    break;
                case 2:
                    Usuario user = users.buscarUsuario();
                    user.mostrarUsuario();
                    break;
                case 3:
                    users.listarUsuarios();
                    break;
                case 4:
                    users.excluirUsuario();
                    break;
                case 0:
                    return;
                default:
                    break;
            }

        }while(true);

    }
}
