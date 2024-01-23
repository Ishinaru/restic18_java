package mastermind;

import java.util.List;

public class ListaConfiguracoes {
    private List<Configuracao> configuracaos;
    public void addConfiguracao(Configuracao config){
        configuracaos.add(config);
    }

    public List<Configuracao> obterConfiguracoes(){
        return configuracaos;
    }
}
