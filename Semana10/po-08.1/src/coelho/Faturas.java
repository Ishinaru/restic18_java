package coelho;

import java.util.Date;

public class Faturas {
    private Date data;
    private double ultimaLeitura;
    private double penultimaLeitura;
    private double valor;
    private boolean quitado = false;
    private Imoveis imovelRelacionado;

    public Faturas(Date data, double valor, Imoveis imovelRelacionado) {
        this.data = data;
        this.valor = valor;
        this.imovelRelacionado = imovelRelacionado;
        this.penultimaLeitura = imovelRelacionado.getPenultimaLeitura();
        this.ultimaLeitura = imovelRelacionado.getUltimaLeitura();
    }
    q
}
