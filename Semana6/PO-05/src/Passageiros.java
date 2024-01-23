public class Passageiros extends Pessoa{
    private static proxIdPassageiro = 1;
    private int idPassageiro;
    private int tipoCartao;

    public Passageiros(String nome, String cpf) {
        super(nome, cpf);
        this.tipoCartao = this.setTipoCartao();
        this.idPassageiro = proxIdPassageiro++;
    }

    public int getIdPassageiro() {
        return idPassageiro;
    }

    public void setTipoCartao() {

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Escolha o tipo de cartão do usuário: " +
                    "0 - Cartão Estudantil\n" +
                    "1 - Cartão de Idoso\n" +
                    "2 - Cartão de Transporte");

            int tipo = sc.nextInt();
            if(tipo == 0){
                this.tipoCartao = 0;
                break;
            }
            else if(tipo == 1){
                this.tipoCartao = 1;
                break;
            }
            else if(tipo == 2) {
                this.tipoCartao = 2;
                break;
            }
            else
                System.out.println("Tipo inválido, escolha entre 0 e 2");
        }while (tipo < 0 || tipo > 2);
        sc.close();
    }

    public int getTipoCartao() {
        return tipoCartao;
    }

    public String toString(){
        if(tipoCartao == 0)
            return super.toString()+"\nId do Passageiro: "+idPassageiro+"\nTipo de Cartão: Estudantil";
        else if(tipoCartao == 1)
            return super.toString()+"\nId do Passageiro: "+idPassageiro+"\nTipo de Cartão: Idoso";
        else
            return super.toString()+"\nId do Passageiro: "+idPassageiro+"\nTipo de Cartão: Transporte";
    }

    public void printPassageiro(){
        System.out.println(this.toString());
    }
}