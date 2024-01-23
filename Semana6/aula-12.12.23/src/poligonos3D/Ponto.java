package poligonos3D;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ponto {
    private float x;
    private float y;
    private float z;
    Ponto(float _x, float _y, float _z) {
        x = _x;
        y = _y;
        z = _z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }

    public float distancia(Ponto p) {
        return (float) sqrt( pow(this.x-p.getX(),2) + pow(this.y-p.getY(),2) + pow(this.y-p.getZ(),2));
    }

    static Ponto solicitaPonto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as coordenadas: ");
        System.out.print("x = ");float x = sc.nextFloat();
        System.out.print("y = ");float y = sc.nextFloat();
        System.out.print("z = ");float z = sc.nextFloat();
        return new Ponto(x,y,z);
    }

    public void mostraPonto(){
        System.out.println("("+this.x+","+this.y+","+this.z+")");
    }
}
