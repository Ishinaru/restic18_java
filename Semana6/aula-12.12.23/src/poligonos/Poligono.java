package poligonos;

import java.util.ArrayList;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Poligono {
    ArrayList<Ponto> pontos;

    Poligono() {
        pontos = new ArrayList<Ponto>();
    }

    void inserePonto(float x, float y) {
        Ponto p = new Ponto (x, y);
        pontos.add(p);
    }

    float perimetro() {
        float per = 0;
        Ponto p1, p2 = null;
        for (int i=0;i<pontos.size()-1;i++) {
            p1 = pontos.get(i);
            p2 = pontos.get(i+1);
            per += sqrt( (pow(p1.x-p2.x,2)) + (pow(p1.y - p2.y,2)) );
        }
        p1 = pontos.get(0);
        per += sqrt( (pow(p1.x-p2.x,2)) + (pow(p1.y - p2.y,2) ));
        return per;
    }
}

