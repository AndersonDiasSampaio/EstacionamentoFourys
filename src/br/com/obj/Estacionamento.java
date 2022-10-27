package br.com.obj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estacionamento {
	private Vaga[] vagas;
	private Integer numeroDeVagas;

	public Estacionamento(Vaga[] vagas, Integer numeroDeVagas) {
		super();
		this.vagas = vagas;
		this.numeroDeVagas = numeroDeVagas;
	}

	public Estacionamento(Integer n) {
		numeroDeVagas = n;
		vagas = new Vaga[n];

		for (int i = 0; i < n; i++) {
			this.vagas[i] = null;
		}
	}

	public void estaciona(Integer n, Vaga Vaga) {
		this.vagas[n - 1] = Vaga;

	}

	public String vagasDisponivel() {
		ArrayList<Integer> vagasDisponiveis = new ArrayList<Integer>();
		for (int i = 0; i < numeroDeVagas; i++) {
			if (vagas[i] == null) {
				vagasDisponiveis.add(i + 1);

			}
		}
		return "As vagas disponiveis sao: " + vagasDisponiveis.toString();
	}

	public String vagasOcupadas() {
		ArrayList<Vaga> vagasOcupadas = new ArrayList<Vaga>();
		for (int i = 0; i < numeroDeVagas; i++) {
			if (vagas[i] != null) {
				vagasOcupadas.add(vagas[i]);
			}
		}
		return "As vagas ocupadas sao: \n" + vagasOcupadas.toString();

	}

	public void infoPessoa(String a) {
		Vaga vaga = new Vaga();
		int count = 0;
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPessoa().getNome().equalsIgnoreCase(a)) {
					System.out.println(this.vagas[i].getCarro().getPessoa());
					count = 1;

				}

			}

		}
		if (count == 0) {
			System.out.println("usuario nao encontrado");

		}

	}

	public String informacaoVeiculo(String a) {
		Vaga vaga = new Vaga();
		int count = 0;
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPlaca().equalsIgnoreCase(a)) {
					// System.out.println(this.vagas[i].getCarro().getPessoa());
					return this.vagas[i].getCarro().informacaoVeiculo();

				}

			}

		}
		/*
		 * if (count == 0) { System.out.println("usuario nao encontrado");
		 * 
		 * }
		 */
		return "Veículo nao encontrado";

	}

	public String horaentradaVeiculo(String a) {
		Vaga vaga = new Vaga();
		int count = 0;
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPlaca().equalsIgnoreCase(a)) {
					return this.vagas[i].getEntrada().toString();

				}

			}

		}
		/*
		 * if (count == 0) { System.out.println("usuario nao encontrado");
		 * 
		 * }
		 */
		return "Veículo nao encontrado";

	}

	public String horasaidaVeiculo(String a) {
		Vaga vaga = new Vaga();
		int count = 0;
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPlaca().equalsIgnoreCase(a)) {
					if (this.vagas[i].getSaida() != null) {
						return this.vagas[i].getSaida().toString();
					} else {
						return "Veículo ainda encontra-se no estaciomento";
					}
					// System.out.println(this.vagas[i].getCarro().getPessoa());

				}

			}

		}
		/*
		 * if (count == 0) { System.out.println("usuario nao encontrado");
		 * 
		 * }
		 */
		return "Veículo nao encontrado";

	}

}
