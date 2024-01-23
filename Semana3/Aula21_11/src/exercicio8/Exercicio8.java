package exercicio8;

public class Exercicio8 {
	public static boolean verificaMaiorIdade(int idade){
		if(idade > 17)
			return true;
		else
			return false;
	}
	
	public static int calculaIdade(int dia, int mes, int ano, int diaAtual, int mesAtual, int anoAtual){
		int idade;
		if(ano <= anoAtual) {
			if(((mes == mesAtual) && (dia <= diaAtual)) || (mes < mesAtual)) {
				  idade = anoAtual - ano;
			}
			else {
				idade  = anoAtual - ano - 1;
			}
			return idade;
		}
		else {
			System.out.println("Ano maior que o atual");
			return -1;
		}
	}
}
