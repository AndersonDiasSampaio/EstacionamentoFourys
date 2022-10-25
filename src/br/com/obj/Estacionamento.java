package br.com.obj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estacionamento {
	Vaga[] vagas;
	Integer numeroDeVagas;

	public Estacionamento(Integer n) {
		numeroDeVagas = n;
		vagas = new Vaga[n];
		System.out.println(vagas);

		for (int i = 0; i < n; i++) {
			this.vagas[i] = null;
		}
		System.out.println(this.vagas[4]);
	}

	public void estaciona(Integer n, Vaga Vaga) {
		this.vagas[n] = Vaga;

	}

	public String vagasDisponivel() {
		ArrayList<Integer> vagasDisponiveis = new ArrayList<Integer>();
		for (int i = 0; i < numeroDeVagas; i++) {
			if (vagas[i] == null) {
				vagasDisponiveis.add(i);

			}
		}
		return vagasDisponiveis.toString();
	}

	public String vagasOcupadas() {
		ArrayList<Vaga> vagasOcupadas = new ArrayList<Vaga>();
		for (int i = 0; i < numeroDeVagas; i++) {
			if (vagas[i] != null) {
				vagasOcupadas.add(vagas[i]);
				System.out.println(vagas[i].getCarro().informacaoVeiculo());
			}
		}
		return vagasOcupadas.toString();

	}

}
