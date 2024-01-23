package hospital;

public class Endereco {
    
    private String rua, bairro, cidade, estado, numero, cep;

    public Endereco(){
        this.rua = "Rua Padrão";
        this.bairro = "Bairro Padrão";
        this.cidade = "Cidade Padrão";
        this.estado = "Estado Padrão";
        this.numero = "0000";
        this.cep = "00000-00";
    }
    public Endereco(String rua, String bairro, String cidade, String estado, String numero, String cep){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua=" + rua +
                ", bairro=" + bairro +
                ", cidade=" + cidade +
                ", estado=" + estado +
                ", numero=" + numero +
                ", cep=" + cep +
                '}';
    }
}
