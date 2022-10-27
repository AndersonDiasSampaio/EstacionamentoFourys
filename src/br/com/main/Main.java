package br.com.main;

import br.com.obj.Vaga;

import java.util.Scanner;

import br.com.iu.IU;
import br.com.obj.Carro;
import br.com.obj.Estacionamento;
import br.com.obj.Pessoa;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*Scanner entrada = new Scanner(System.in);
		Integer n;
		// TODO Auto-generated method stub
		Pessoa anderson = new Pessoa("Anderson", "09339394429", "5454651", "84651641");
		Carro uno = new Carro("Preta", "786464", "Uno", anderson);
		Vaga vaga = new Vaga(1, uno);
		System.out.println(uno.informacaoVeiculo());
		System.out.println(uno.informacaoPessoa());
		System.out.println(vaga.getEntrada());
		System.out.println(vaga.getSaida());
		System.out.println("Digite o tamanho do estacionamento");
		n=entrada.nextInt();
		Estacionamento estacionamento = new Estacionamento(n);
		System.out.println(estacionamento.vagasDisponivel());
		estacionamento.estaciona(vaga.getPosicao(), vaga);
		System.out.println(estacionamento.vagasDisponivel());
		System.out.println(estacionamento.vagasOcupadas());*/
		IU iu = new IU();
		iu.menu();
	}

}
