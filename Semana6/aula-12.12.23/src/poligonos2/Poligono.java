package poligonos2;

import java.util.ArrayList;
import java.util.Iterator;

class Poligono {
    private ArrayList<Ponto> pontos = new ArrayList<>();

    public Poligono() {
    }

    public void inserePonto(Ponto p) {
        this.pontos.add(p);
    }

    public float perimetro() {
        float per = 0.0F;
        Ponto p2 = (Ponto)this.pontos.getFirst();
        Ponto p1;

        for (int i=0;i<this.pontos.size()-1;++i) {
            p1 = (Ponto)this.pontos.get(i);
            p2 = (Ponto)this.pontos.get(i+1);
            per += p1.distancia(p2);
        }
        p1 = (Ponto)this.pontos.getFirst();
        per += p1.distancia(p2);
        return per;
    }

    public void monstraPontos() {
        Iterator var = this.pontos.iterator();

        while (var.hasNext()) {
            Ponto p = (Ponto) var.next();
            p.mostraPonto();
        }
    }
}