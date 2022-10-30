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

	public String retornaCarroDadoAvaga(Integer i) {
		return this.vagas[i].getCarro().informacaoVeiculo();
	}

	public String retornaVagaDadaAplaca(String a) {
		Integer count = 0;
		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null) {
				if (this.vagas[i].getCarro().getPlaca().equalsIgnoreCase(a)) {
					// System.out.println(this.vagas[i].getCarro().getPessoa());
					count++;
					return "A vaga ocupada pelo carro com placa: " + a + " é " + this.vagas[i].getPosicao();

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
		ArrayList<Vaga> vagasOcupadas = new ArrayList<Vaga>();
		for (int i = 0; i < numeroDeVagas; i++) {
			if (vagas[i] != null && this.vagas[i].getSaida() == null) {
				vagasOcupadas.add(vagas[i]);
				System.out.println(vagas[i]);
			}
		}
		// return "As vagas ocupadas sao: \n" + vagasOcupadas.toString();

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
		return "Veículo encontra-se no estacionamento";

	}

	public void saidaVeiculo(String a) {
		Vaga vaga = new Vaga();
		int count = 0;
		List<Vaga> aux3 = new ArrayList();

		for (int i = 0; i < vagas.length; i++) {

			if (this.vagas[i] != null && this.vagas[i].getCarro().getPlaca().equals(a)) {
				this.vagas[i].setSaida();
				if (map.get(i + 1) != null) {
					aux3 = map.get(i + 1);
					aux3.add(this.vagas[i]);
					map.put(i + 1, aux3);
					this.vagas[i] = null;
				} else {
					aux3.add(this.vagas[i]);
					map.put(i + 1, aux3);
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
		Vaga vaga = new Vaga();
		int count = 0;
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
			// System.out.println("A vaga " + key + " ,possui o seguinte historico" +
			// this.map.get(key));
		}

		/*
		 * if (count == 0) { System.out.println("usuario nao encontrado");
		 * 
		 * }
		 */

	}

	public void imprimehistorico() {
		Vaga vaga = new Vaga();
		int count = 0;
		List<Vaga> aux3 = new ArrayList();
		System.out.println("Histórico de VAgas");
		System.out.println("Vagas Ocupadas Atualmente:");
		vagasOcupadas();
		System.out.println("Histórico de Ocupacao:");
		for (Integer key : map.keySet()) {

			aux3 = this.map.get(key);
			System.out.println("A vaga " + key + " ,possui o seguinte historico\n");
			for (Vaga Y : aux3) {
				System.out.println(Y.historico());

			}
			// System.out.println("A vaga " + key + " ,possui o seguinte historico" +
			// this.map.get(key));
		}

}
}