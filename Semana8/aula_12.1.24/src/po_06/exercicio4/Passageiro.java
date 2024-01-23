package po_06.exercicio4;

import java.util.Scanner;

public class Passageiro extends Pessoa{
    private static int proxIdPassageiro = 1;
    private int idPassageiro;
    private int tipoCartao;

    public Passageiro(String nome, String cpf) {
        super(nome, cpf);
        this.tipoCartao = this.setTipoCartao();
        this.idPassageiro = proxIdPassageiro++;
    }

    public int getIdPassageiro() {
        return idPassageiro;
    }

    public int setTipoCartao() {

        Scanner sc = new Scanner(System.in);

        int tipo;
        do {
            System.out.println("Escolha o tipo de cartão do usuário: " +
                    "0 - Cartão Estudantil\n" +
                    "1 - Cartão de Idoso\n" +
                    "2 - Cartão de Transporte");

            tipo = sc.nextInt();
            if (tipo == 0) {
                this.tipoCartao = 0;
            } else if (tipo == 1) {
                this.tipoCartao = 1;
            } else if (tipo == 2) {
                this.tipoCartao = 2;
            } else
                System.out.println("Tipo inválido, escolha entre 0 e 2");
        } while (tipo < 0 || tipo > 2);
        sc.close();
        return tipo;
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
