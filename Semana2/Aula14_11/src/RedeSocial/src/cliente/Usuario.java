package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String email;
	private String nacionalidade;
	private ArrayList<String> postagens;
	private int quantidadePostagens;
	private int pontuacao;

	public Usuario(String nome, String email, String nacionalidade) {
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
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

	private void adicionaPostagem(String post) {
		postagens.add(post);
		quantidadePostagens += 1;
	}

	private void alterarPontuacao(int delta) {
		pontuacao += delta;
	}

	public static void main(String[] args) {
		do{
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva o nome: ");
		String nome = sc.nextLine();
		System.out.print("Escreva o email: ");
		String email = sc.nextLine();
		System.out.print("Escreva a nascionalidade: ");
		String nasc = sc.nextLine();
		Usuario usuario = new Usuario(nome, email, nasc);
		System.out.print("Escreva a postagem 1:");
		String postagem = sc.nextLine();
		usuario.adicionaPostagem(postagem);
		System.out.print("Escreva a postagem 2:");
		postagem = sc.nextLine();
		usuario.adicionaPostagem(postagem);
		System.out.print("Escreva a postagem 3:");
		postagem = sc.nextLine();
		usuario.adicionaPostagem(postagem);
		
		System.out.println(usuario.getPostagens());
		System.out.println("Quantide de postagens = " + usuario.getQuantidadePostagens());
		System.out.println("Pontuação = " + usuario.getPontuacao());
		usuario.alterarPontuacao(-20);
		System.out.println("Pontuação = " + usuario.getPontuacao());
		
		System.out.print("Escreva a postagem 4:");
		postagem = sc.nextLine();
		usuario.adicionaPostagem(postagem);
		usuario.alterarPontuacao(100);
		System.out.println("Quantide de postagens = " + usuario.getQuantidadePostagens());
		System.out.println("Pontuação = " + usuario.getPontuacao());
		
		sc.close();
		}while();
		
	}

}
