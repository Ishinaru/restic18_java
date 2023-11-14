package aula14_11;

import java.util.Scanner;

public class MainCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o cpf: ");
		String cpf = sc.nextLine();
		Cliente c1 = new Cliente(nome, cpf);
		System.out.println("Nome do Cliente: " + c1.getNome());
		System.out.println("Idade de " + c1.getNome() + " igual a " + c1.getIdade() + " anos.");
		System.out.println("CPF de " + c1.getNome() + " igual a " + c1.getCpf());
		
		System.out.print("Altere o nome: ");
		nome = sc.nextLine();
		c1.setNome(nome);
		System.out.print("Altere a idade: ");
		int idade = sc.nextInt();
		c1.setIdade(idade);
		sc.nextLine();
		System.out.print("Altere o cpf: ");
		cpf = sc.nextLine();
		c1.setCpf(cpf);
		System.out.println("---------------------");
		System.out.println("DADOS ATUALIZADOS");
		System.out.println("---------------------");

		System.out.println("Nome do Cliente: " + c1.getNome());
		System.out.println("Idade de " + c1.getNome() + " igual a " + c1.getIdade() + " anos.");
		System.out.println("CPF de " + c1.getNome() + " igual a " + c1.getCpf());

		sc.close();
	}

}
