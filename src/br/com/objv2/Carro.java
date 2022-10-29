package br.com.objv2;

import java.util.List;

public class Carro {

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	private	String cor;
	private	String placa;
	private	String modelo;
	private	Pessoa pessoa;

	public Carro(String cor, String placa, String modelo, Pessoa pessoa) {
		this.cor = cor;
		this.placa = placa;
		this.modelo = modelo;
		this.pessoa = pessoa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void addPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String informacaoVeiculo() {
		return "Informacao do veiculo: " + "| modelo: " + this.modelo + " | Cor: " + this.cor + " | placa " + this.placa + " | Dono "
				+ this.pessoa.getCpf();
	}

	public String informacaoPessoa() {
		return this.pessoa.toString();
	}
}