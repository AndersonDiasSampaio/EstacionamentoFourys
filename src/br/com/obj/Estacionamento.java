package br.com.obj;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	List<Vaga> quantidadeDeVagas;
	Integer tamanhoDoEstacionamento;

	public Estacionamento(Integer n) {
		this.tamanhoDoEstacionamento = n;
		quantidadeDeVagas = new ArrayList<Vaga>(n);
		for(int i=0;i<n;i++) {
		this.quantidadeDeVagas.add(null);// lembrar que pode adicionar nulo.
		}

	}

	public List<Vaga> getQuantidadeDeVagas() {

		return quantidadeDeVagas;
	}

	public void setQuantidadeDeVagas(Vaga vaga) {
		this.quantidadeDeVagas.add(vaga);
	}

	public void teste(Integer n) {
		Estacionamento esta = new Estacionamento(n);
	

	}
}
