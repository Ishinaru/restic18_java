package quadrado;

public class Quadrado {
    private String estado;
    public Quadrado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public void inverte(int k){
        if(estado.charAt(k) == 'O')
          estado.charAt(k). = 'X';
        else
            estado.
    }
    public void clique(int k){
        switch (k){
            case 1:
                inverte(0);
                inverte(1);
                inverte(3);
                break;
            case 2:
                inverte(0);
                inverte(1);
                inverte(2);
                inverte(4);
                break;
            case 3:
                inverte(1);
                inverte(2);
                inverte(5);
                break;
            case 4:
                inverte(0);
                inverte(3);
                inverte(4);
                inverte(6);
                break;
            case 5:
                inverte(1);
                inverte(3);
                inverte(4);
                inverte(5);
                inverte(7);
                break;
            case 6:
                inverte(2);
                inverte(4);
                inverte(5);
                inverte(8);
                break;
            case 7:
                inverte(3);
                inverte(6);
                inverte(7);
                break;
            case 8:
                inverte(4);
                inverte(6);
                inverte(7);
                inverte(8);
                break;
            case 9:
                inverte(5);
                inverte(7);
                inverte(8);
                break;
        }
    }


}
