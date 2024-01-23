package poligonos3D_ruim;

import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Poligono {
    private ArrayList<Ponto> pontos;

    Poligono() {
        pontos = new ArrayList<Ponto>();
    }

    public void inserePonto(float x, float y, float z) {
        Ponto p = new Ponto (x, y, z);
        pontos.add(p);
    }

    public float perimetro() {
        float per = 0;
        Ponto p1, p2 = pontos.get(1);
        for (int i=0;i<pontos.size()-1;i++) {
            p1 = pontos.get(i);
            p2 = pontos.get(i+1);
            per += sqrt( (pow(p1.getX() - p2.getX(),2)) + (pow(p1.getY() - p2.getY(),2)) );
        }
        p1 = pontos.get(0);
        per += (float)sqrt( (pow(p1.getX() - p2.getX(),2)) + (pow(p1.getY() - p2.getY(),2) ));
        return per;
    }

    public void mostraPontos() {
        for (int i = 0; i < pontos.size(); i++) {
            System.out.println("(" + pontos.get(i).getX() + "," + pontos.get(i).getY() +" ,"+ pontos.get(i).getZ()+")");
        }
    }
}

