package br.com.objv2;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estacionamento {
	private Vaga[] vagas;
	private Integer numeroDeVagas;
	private Map<Integer, List<Vaga>> map = new HashMap<>();
	private List<Vaga> ListaMap = new ArrayList();
	private Integer ContadorMap = 0;
	private Caixa caixa;

	public Estacionamento(Vaga[] vagas, Integer numeroDeVagas) {
		super();
		this.vagas = vagas;
		this.numeroDeVagas = numeroDeVagas;
	}

	public Estacionamento(Integer n, Double a) {
		numeroDeVagas = n;
		vagas = new Vaga[n];
		caixa = new Caixa(a);

		for (int i = 0; i < n; i++) {
			this.vagas[i] = null;
		}
	}

	public String retornaCarroDadoAvaga(Integer i) {
		if (this.vagas[i - 1] != null) {
			return this.vagas[i - 1].getCarro().informacaoVeiculo();
		} else {
			String a = "Vaga Vazia";
			return a;
		}
	}

	public String retornaVagaDadaAplaca(String a) {
		Integer count = 0;
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPlaca().equalsIgnoreCase(a)) {
					// System.out.println(this.vagas[i].getCarro().getPessoa());
					count++;
					return "A vaga ocupada pelo carro com placa: " + a + " e " + this.vagas[i].getPosicao();

				}

			}

		}
		if (count == 0) {
		}
		return "O carro com a placa: " + a + " nao se encontra no estacionamento";

	}

	public void estaciona(Integer n, Vaga Vaga) {
		if (this.vagas[n - 1] == null) {
			this.vagas[n - 1] = Vaga;
		} else {
			System.out.println("Vaga indisponível");
		}

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

	public void /* String */ vagasOcupadas() {
		int count = 0;
		ArrayList<Vaga> vagasOcupadas = new ArrayList<Vaga>();
		for (int i = 0; i < numeroDeVagas; i++) {
			if (vagas[i] != null && this.vagas[i].getSaida() == null) {
				vagasOcupadas.add(vagas[i]);
				System.out.println(vagas[i]);
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("Nao há vagas ocupadas");

		}
		// return "As vagas ocupadas sao: \n" + vagasOcupadas.toString();

	}

	public void infoPessoa(String a) {
		int count = 0;
		List<Vaga> aux3 = new ArrayList();

		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPessoa().getNome().equalsIgnoreCase(a)) {
					System.out.println(this.vagas[i].getCarro().getPessoa());
					count = 1;

				}

			}
		}
		if (count == 0) {
			for (Integer key : map.keySet()) {

				aux3 = this.map.get(key);
				for (Vaga y : aux3) {

					if (y.getCarro().getPessoa().getNome().equals(a)) {
						System.out.println(y.getCarro().getPessoa());
						count = 1;
					}

				}

			}
		}

		if (count == 0) {
			System.out.println("usuario nao encontrado");

		}

	}

	public void informacaoVeiculo(String a) {
		int count = 0;
		List<Vaga> aux3 = new ArrayList();
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPlaca().equalsIgnoreCase(a)) {
					count = 1;
					System.out.println(this.vagas[i].getCarro().informacaoVeiculo());

				}

			}

		}
		if (count == 0) {
			for (Integer key : map.keySet()) {

				aux3 = this.map.get(key);
				for (Vaga y : aux3) {

					if (y.getCarro().getPlaca().equals(a)) {
						System.out.println(y.getCarro().informacaoVeiculo());
						count = 1;
					}

				}

			}
		}

		if (count == 0) {
			System.out.println("Veículo nao encontrado");

		}

	}

	public void horaentradaVeiculo(String a) {
		List<Vaga> aux3 = new ArrayList();

		int count = 0;
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPlaca().equalsIgnoreCase(a)) {
					System.out.println(vagas[i].getEntrada().toString());
					count = 1;
				}

			}

		}
		if (count == 0) {
			for (Integer key : map.keySet()) {

				aux3 = this.map.get(key);
				System.out.println("O carro com placa " + a + " entrou as: ");
				for (Vaga Y : aux3) {
					if (Y.getCarro().getPlaca().equals(a)) {
						System.out.println(Y.getEntrada());
						count = 1;

					}

				}

			}

		}

	}

	public void horasaidaVeiculo(String a) {
		List<Vaga> aux3 = new ArrayList();
		Integer count = 0;
		for (Integer key : map.keySet()) {

			aux3 = this.map.get(key);
			System.out.println("O carro com placa " + a + " saiu as: ");
			for (Vaga y : aux3) {
				if (y.getCarro().getPlaca().equals(a) && y.getSaida() != null) {
					System.out.println(y.getSaida());
					count = 1;
				}

			}

		}
		if (count == 0) {
			System.out.println("Veiculo ainda encontra-se no estacionamento");

		}

	}

	public void saidaVeiculo(String a) {
		List<Vaga> aux3 = new ArrayList();

		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null && this.vagas[i].getCarro().getPlaca().equals(a)) {
				this.vagas[i].setSaida();
				if (map.get(i + 1) != null) {
					aux3 = map.get(i + 1);
					aux3.add(this.vagas[i]);
					caixa.setCaixa(this.vagas[i].getEntrada(), this.vagas[i].getSaida());
					map.put(i + 1, aux3);
					this.vagas[i] = null;
				} else {
					aux3.add(this.vagas[i]);
					map.put(i + 1, aux3);
					caixa.setCaixa(this.vagas[i].getEntrada(), this.vagas[i].getSaida());
					this.vagas[i] = null;
				}

			}

		}
		/*
		 * if (count == 0) { System.out.println("usuario nao encontrado");
		 * 
		 * }
		 */

	}

	public void saidahistorico() {
		List<Vaga> aux3 = new ArrayList();
		System.out.println("Histórico de VAgas");
		System.out.println("Vagas Ocupadas Atualmente:");
		vagasOcupadas();
		System.out.println("Histórico de ocupacao anteriores:");
		for (Integer key : map.keySet()) {

			aux3 = this.map.get(key);
			System.out.println("A vaga " + key + " ,possui o seguinte historico\n");
			for (Vaga Y : aux3) {
				System.out.println(Y.historico());

			}

		}

	}

	public void imprimehistorico() {
		List<Vaga> aux3 = new ArrayList();

		System.out.println("Histórico de Ocupacao:");
		for (Integer key : map.keySet()) {

			aux3 = this.map.get(key);
			System.out.println("A vaga " + key + " ,possui o seguinte historico\n");
			for (Vaga Y : aux3) {
				System.out.println(Y.historico());

			}

		}

	}

	public Double caixaEstacionamento() {
		return this.caixa.getCaixa();
	}

}