package poligonos2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Ponto {
    private float x;
    private float y;
    Ponto(float _x, float _y) {
        x = _x;
        y = _y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float distancia(Ponto p) {
        return (float) sqrt( pow(this.x-p.getX(),2) + pow(this.y-p.getY(),2) );
    }

    static Ponto solicitaPonto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as coordenadas: ");
        System.out.print("x = ");float x = sc.nextFloat();
        System.out.print("y = ");float y = sc.nextFloat();
        return new Ponto(x,y);
    }

    public void mostraPonto(){
        System.out.println("("+this.x+","+this.y+")");
    }
}
