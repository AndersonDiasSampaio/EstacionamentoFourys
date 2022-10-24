package br.com.obj;

import java.util.List;

public class Carro {

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	String cor;
	String placa;
	String modelo;
	Pessoa pessoa;

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

	public String getPessoa() {
		return pessoa.toString();
	}

	public void addPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String informacaoVeiculo() {
		return "Veiculo: "
				+ "modelo: "+this.modelo+" Cor: "+this.cor+" placa "+this.placa+" Dono "+this.pessoa.toString();
	}
	public String informacaoPessoa() {
		return this.pessoa.toString();
	}
}