package op_03;

public class DivisaoPorZeroException extends Exception{

    private String msgPersonalizada;

    public DivisaoPorZeroException(String msgPersonalizada) {
        this.msgPersonalizada = msgPersonalizada;
    }

    public String getMsgPersonalizada() {
        return msgPersonalizada;
    }


}
