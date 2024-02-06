package coelho;

import java.time.LocalDateTime;
import java.util.Date;

public class Faturas {
    private LocalDateTime data;
    private double ultimaLeitura;
    private double penultimaLeitura;
    private double valor;
    private boolean quitado;
    private Imoveis imovelRelacionado;

    public Faturas(LocalDateTime data, double valor, Imoveis imovelRelacionado) {
        this.data = data;
        this.valor = valor;
        this.imovelRelacionado = imovelRelacionado;
        this.penultimaLeitura = imovelRelacionado.getPenultimaLeitura();
        this.ultimaLeitura = imovelRelacionado.getUltimaLeitura();
        this.quitado = false;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getUltimaLeitura() {
        return ultimaLeitura;
    }

    public void setUltimaLeitura(double ultimaLeitura) {
        this.ultimaLeitura = ultimaLeitura;
    }

    public double getPenultimaLeitura() {
        return penultimaLeitura;
    }

    public void setPenultimaLeitura(double penultimaLeitura) {
        this.penultimaLeitura = penultimaLeitura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isQuitado() {
        return quitado;
    }

    public void setQuitado(boolean quitado) {
        this.quitado = quitado;
    }

    public Imoveis getImovelRelacionado() {
        return imovelRelacionado;
    }

    public void setImovelRelacionado(Imoveis imovelRelacionado) {
        this.imovelRelacionado = imovelRelacionado;
    }
}
