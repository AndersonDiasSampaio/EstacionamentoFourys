package br.com.obj;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	List<Vaga> quantidadeDeVagas;
	Integer tamanhoDoEstacionamento;

	public List<Vaga> getQuantidadeDeVagas() {
		
		return quantidadeDeVagas;
	}

	public void setQuantidadeDeVagas(Vaga vaga) {
		this.quantidadeDeVagas.add(vaga);
	}

	public Estacionamento(Integer n) {
		this.tamanhoDoEstacionamento=n;
		quantidadeDeVagas = new ArrayList<Vaga>(n);
		
	}
	public  void teste(Integer n) {
		Estacionamento esta= new Estacionamento(n);
		
	}
}
