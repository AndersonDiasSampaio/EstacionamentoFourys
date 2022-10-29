package br.com.objv2;

import java.time.LocalDateTime;
import java.util.List;

public class Vaga {
	private Boolean isOcupped;
	private Integer posicao;
	private LocalDateTime entrada;
	private LocalDateTime saida;
	private Carro carro;

	public Vaga(Integer posicao, Carro carro) {
		this.isOcupped = true;
		this.posicao = posicao;
		this.carro = carro;
		this.entrada = LocalDateTime.now();
		this.saida = null;

	}

	public Vaga() {
		this.isOcupped = false;
		this.posicao = null;
		this.carro = null;
		this.entrada = null;
		this.saida = null;
	}

	public Boolean getIsOcupped() {
		return isOcupped;
	}

	public void setTrueIsOcupped() {
		this.isOcupped = true;
	}

	public void setFalseIsOcupped() {
		this.isOcupped = false;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public LocalDateTime getEntrada() {
		return entrada;
	}

	public void setEntrada() {
		this.entrada = LocalDateTime.now();
	}

	public LocalDateTime getSaida() {
		return saida;
	}

	public void setSaida() {
		this.saida = LocalDateTime.now();
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public String minhaVaga() {
		if (this.isOcupped == true) {
			return "Vaga Ocupada" + " | Posicao: " + this.posicao + " | Data e Hora da entrada: " + this.entrada + " | "
					+ this.carro.informacaoVeiculo();
		} else {
			return "Vaga Livre " + this.isOcupped + " | Posicao: " + this.posicao + " | Data e Hora da entrada: "
					+ this.entrada + " | " + this.carro.informacaoVeiculo();
		}
	}

	@Override
	public String toString() {
		if (this.isOcupped == true) {
			return "Vaga Ocupada" + " | Posicao: " + this.posicao + " | Data e Hora da entrada: " + this.entrada + " | "
					+ this.carro.informacaoVeiculo();
		} else {
			return "Vaga Livre " + this.isOcupped + " | Posicao: " + this.posicao + " | Data e Hora da entrada: "
					+ this.entrada + " | " + this.carro.informacaoVeiculo() + "\n";
		}
	}

	public String historico() {

		return "Vaga Ocupada" + " | Posicao: " + this.posicao + " | Data e Hora da entrada: " + this.entrada + " | "
				+ "| Data e Hora da Saida "+this.getSaida()+"  |  " + this.carro.informacaoVeiculo();

	}

}
