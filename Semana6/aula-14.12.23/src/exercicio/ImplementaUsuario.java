package exercicio;

import java.util.ArrayList;

public class ImplementaUsuario {
    private ArrayList<Usuario>usuarios = new ArrayList<Usuario>();

    public void addUsuario(Usuario user){
        this.usuarios.add(user);
    }
    public void listar(){
        for (Usuario usuario:usuarios){
            System.out.println(usuario.mostraUsuario());
        }
    }
    public void listar(int x){
        for(int i=x;i<usuarios.size();i++){
            System.out.println(usuarios.get(i).mostraUsuario());
        }
    }
    public void listar(int x, int y){
        for(int i=x;i<y;i++){
            System.out.println(usuarios.get(i).mostraUsuario());
        }
    }

}
