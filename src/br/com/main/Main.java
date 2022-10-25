package br.com.main;

import br.com.obj.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa anderson = new Pessoa("Anderson", "09339394429", 5454651, "84651641");
		Carro uno = new Carro("Preta", "786464", "Uno", anderson);
		Vaga vaga = new Vaga(1, uno);
		System.out.println(uno.informacaoVeiculo());
		System.out.println(uno.informacaoPessoa());
		System.out.println(vaga.minhaVaga());
		System.out.println(vaga.getEntrada());
		System.out.println(vaga.getSaida());
		vaga.getCarro().getCor();
		Vaga[] teste = new Vaga[50];
		teste[1] = vaga;
		System.out.println(teste[1].minhaVaga());
		Estacionamento estacionamento = new Estacionamento(5);
		System.out.println(estacionamento.vagasDisponivel());
		estacionamento.estaciona(vaga.getPosicao(), vaga);
		System.out.println(estacionamento.vagasDisponivel());
		System.out.println(estacionamento.vagasOcupadas());
	}

}
