package br.com.obj;

import java.util.List;

public class Carro {

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	String cor;
	String placa;
	String modelo;
	List<Pessoa> pessoa;

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
		this.pessoa.add(pessoa);
	}

}