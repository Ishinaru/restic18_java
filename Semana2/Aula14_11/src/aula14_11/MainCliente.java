package aula14_11;

import java.util.Scanner;

public class MainCliente {

	public static void main(String[] args) {
		boolean op = true;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite o cpf: ");
		String cpf = sc.nextLine();
		Cliente c1 = new Cliente(nome, cpf);

		System.out.println("Nome do Cliente: " + c1.getNome());
		System.out.println("Idade de " + c1.getNome() + " igual a " + c1.getIdade() + " anos.");
		System.out.println("CPF de " + c1.getNome() + " igual a " + c1.getCpf());

		while (op) {
			System.out.print("Alterar o nome? ");
			String opc = sc.nextLine();
			if (opc.equals("n") || opc.equals("nao"))
				op = false;
			else {
				System.out.print("Digite o novo nome: ");
				nome = sc.nextLine();
				c1.setNome(nome);
			}
			System.out.print("Alterar a idade? ");
			opc = sc.nextLine();
			if (opc.equals("n") || opc.equals("nao"))
				op = false;
			else {
				System.out.print("Digite a nova idade: ");
				int idade = sc.nextInt();
				c1.setIdade(idade);
				sc.nextLine();
			}
			
			System.out.print("Alterar o cpf? ");
			opc = sc.nextLine();
			if (opc.equals("n") || opc.equals("nao"))
				op = false;
			else {
				System.out.print("Digite o novo cpf: ");
				cpf = sc.nextLine();
				c1.setCpf(cpf);

			}
			
			System.out.print("Deseja continuar? ");
			opc = sc.nextLine();
			if (opc.equals("n") || opc.equals("nao"))
				op = false;
			else
				op = true;
				
			
			System.out.println("---------------------");
			System.out.println("DADOS ATUALIZADOS");
			System.out.println("---------------------");

			System.out.println("Nome do Cliente: " + c1.getNome());
			System.out.println("Idade de " + c1.getNome() + " igual a " + c1.getIdade() + " anos.");
			System.out.println("CPF de " + c1.getNome() + " igual a " + c1.getCpf());
		}
		sc.close();
	}

}
