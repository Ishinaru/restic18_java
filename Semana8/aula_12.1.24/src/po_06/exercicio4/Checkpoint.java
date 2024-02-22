package po_06.exercicio4;

import java.util.Date;

public class Checkpoint {
    private Passageiro passageiro;
    private PontoParada pontoDeEmbarque;
    private Date dataHoraEmbarque;

    public Checkpoint(Passageiro passageiro, PontoParada pontoDeEmbarque) {
        this.passageiro = passageiro;
        this.pontoDeEmbarque = pontoDeEmbarque;
        this.dataHoraEmbarque = new Date();
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public PontoParada getPontoDeEmbarque() {
        return pontoDeEmbarque;
    }

    public Date getDataHoraEmbarque() {
        return dataHoraEmbarque;
    }
}
