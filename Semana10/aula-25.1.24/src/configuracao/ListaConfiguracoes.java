package configuracao;

import java.io.File;
import java.util.List;

public class ListaConfiguracoes {
    public static final String CAMINHO = "."+ File.separator+"arquivos"+File.separator;
    private String nomeArquivo;
    private List <Configuracao> configuracoes;

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public List<Configuracao> getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(List<Configuracao> configuracoes) {
        this.configuracoes = configuracoes;
    }
}
