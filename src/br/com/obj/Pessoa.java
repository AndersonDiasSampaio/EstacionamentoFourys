package br.com.obj;

public class Pessoa {

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	private String nome;
	private String cpf;
	private	Integer telefone;
	private	String cnh;

	public Pessoa(String nome, String cpf, Integer telefone, String cnh) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cnh = cnh;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " CPF: " + this.cpf + " CNH: " + this.cnh + " Telefone: " + this.telefone;
	}
}