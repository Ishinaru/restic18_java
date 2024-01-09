package exercicio_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	private String nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadePostagens;
	private int pontuacao;

	public String getSenha() {
		return senha;
	}

	public Usuario(String nome, String email, String senha, String nacionalidade) {
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.senha = senha;
		this.postagens = new ArrayList<String>();
		this.quantidadePostagens = 0;
		this.pontuacao = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public ArrayList<String> getPostagens() {
		return postagens;
	}

	public void setPostagens(ArrayList<String> postagens) {
		this.postagens = postagens;
	}

	public int getQuantidadePostagens() {
		return quantidadePostagens;
	}

	public void setQuantidadePostagens(int quantidadePostagens) {
		this.quantidadePostagens = quantidadePostagens;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public void adicionaPostagem(String post) {
		postagens.add(post);
		quantidadePostagens += 1;
	}

	public void alterarPontuacao(int delta) {
		if (pontuacao + delta < 0) {
			System.out.println("Pontuação negativa");
		} else {
			pontuacao += delta;
		}
	}

	public void mostrarPostagens() {
		for (int i = 0; i < postagens.size(); i++) {
			System.out.println(postagens.get(i)+"\n");
		}
	}

	public String toString(){
		return "Nome: "+nome+";Email: "+email+";Nacionalidade: "+nacionalidade;
	}

	public void mostrarUsuario(){
		System.out.println("USUÁRIO:\t"+this.toString());
	}

	public static void main(String[] args) {
		String sn;
		Scanner sc = new Scanner(System.in);
		do {
			ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

			System.out.print("Escreva o nome: ");
			String nome = sc.nextLine();
			System.out.print("Escreva o email: ");
			String email = sc.nextLine();
			System.out.print("Escreva a nascionalidade: ");
			String nasc = sc.nextLine();
			Usuario usuario = new Usuario(nome, email, senha, nasc);
			listaUsuarios.add(usuario);
			do {
				System.out.print("Deseja fazer uma postagem? ");
				sn = sc.nextLine();
				if (sn.equals("n")) {
					break;
				} else {
					System.out.print("Escreva aqui sua postagem: ");
					String post = sc.nextLine();
					usuario.adicionaPostagem(post);
				}

			} while (!sn.equals("n"));

			System.out.println("Postagens de "+usuario.getNome()+" : ");
			usuario.mostrarPostagens();

			System.out.print("Deseja inserir novos usuários? ");
			sn = sc.nextLine();
		} while (!sn.equals("n"));
		sc.close();

	}

}
