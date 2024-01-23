package po_04.calculadora;

public class DivisaoPorZeroException extends Exception{

    private String msgPersonalizada;

    public DivisaoPorZeroException(String msgPersonalizada) {
        this.msgPersonalizada = msgPersonalizada;
    }

    public String getMsgPersonalizada() {
        return msgPersonalizada;
    }


}
