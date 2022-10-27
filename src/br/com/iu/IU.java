package br.com.iu;

import java.util.Scanner;

import br.com.obj.*;

public class IU {
	private Scanner entrada = new Scanner(System.in);
	private Integer parada = 10;

	public IU() {
		// TODO Auto-generated constructor stub

	}

	public void menu() {
		String[] valorPessoa = new String[4];
		String[] valorCarro = new String[3];
		Integer[] valorVaga = new Integer[1];
		Estacionamento estacionamento;
		Integer valor = 0;
		Pessoa a;
		Carro b;
		Vaga c;
		Integer aux;
		String aux2;

		System.out.println("Digite o tamanho do estacionamento");
		aux = entrada.nextInt();
		estacionamento = new Estacionamento(aux);
		System.out.println("Bom dia, iremos cadastrar suas informações");
		System.out.println("Digite os dados do  usuário");
		System.out.println("Digite o nome do usuário");
		valorPessoa[0] = entrada.next();
		System.out.println("digite o CPF");
		valorPessoa[1] = entrada.next();
		System.out.println("Digite o telefone");
		valorPessoa[2] = entrada.next();
		System.out.println("Digite a CNH");
		valorPessoa[3] = entrada.next();
		a = new Pessoa(valorPessoa[0], valorPessoa[1], valorPessoa[2], valorPessoa[3]);
		System.out.println("Digite os dados do carro");
		System.out.println("Digite o modelo do carro");
		valorCarro[0] = entrada.next();
		System.out.println("Digite a cor do carro");
		valorCarro[1] = entrada.next();
		System.out.println("Digite a placa do carro");
		valorCarro[2] = entrada.next();
		b = new Carro(valorCarro[1], valorCarro[2], valorCarro[0], a);
		System.out.println("Digite a Vaga que vai estacionar");
		valorVaga[0] = entrada.nextInt();
		c = new Vaga(valorVaga[0], b);
		estacionamento.estaciona(c.getPosicao(), c);
		System.out.println("Digite 1 para cadastro");
		System.out.println("Digite 2 para informações do veículo");
		System.out.println("Digite 3 para informacao da pessoa");
		System.out.println("Digite 4 para vagas disponiveis");
		System.out.println("Digite 5 para vagas ocupadas");
		System.out.println("Digite 6 para hora da entrada do veiculo");
		System.out.println("Digite 7 para hora da saida do veiculo");
		System.out.println("Digite 8 sair  veiculo");

		valor = entrada.nextInt();
		while (valor != parada) {

			if (valor == 1) {
				System.out.println("Digite os dados do  usuário");
				System.out.println("Digite o nome do usuário");
				valorPessoa[0] = entrada.next();
				System.out.println("digite o CPF");
				valorPessoa[1] = entrada.next();
				System.out.println("Digite o telefone");
				valorPessoa[2] = entrada.next();
				System.out.println("Digite a CNH");
				valorPessoa[3] = entrada.next();
				a = new Pessoa(valorPessoa[0], valorPessoa[1], valorPessoa[2], valorPessoa[3]);
				System.out.println("Digite os dados do carro");
				System.out.println("Digite o modelo do carro");
				valorCarro[0] = entrada.next();
				System.out.println("Digite a cor do carro");
				valorCarro[1] = entrada.next();
				System.out.println("Digite a placa do carro");
				valorCarro[2] = entrada.next();
				b = new Carro(valorCarro[1], valorCarro[2], valorCarro[0], a);
				System.out.println("Digite a Vaga que vai estacionar");
				valorVaga[0] = entrada.nextInt();
				c = new Vaga(valorVaga[0], b);
				estacionamento.estaciona(c.getPosicao(), c);

			} else if (valor == 2) {
				System.out.println("Digite a placa do veículo");
				aux2 = entrada.next();

				System.out.println(estacionamento.informacaoVeiculo(aux2));

			} else if (valor == 3) {
				System.out.println("Digite o nome da pessoa");
				aux2 = entrada.next();

				estacionamento.infoPessoa(aux2);

			} else if (valor == 4) {
				System.out.println(estacionamento.vagasDisponivel());

			} else if (valor == 5) {
				System.out.println(estacionamento.vagasOcupadas());

			} else if (valor == 6) {
				System.out.println("Digite a placa do veículo, para localizarmos a hora de entrada");
				aux2 = entrada.next();

				System.out.println(estacionamento.horaentradaVeiculo(aux2));

			} else if (valor == 7) {
				System.out.println("Digite a placa do veículo, para localizarmos a hora de saida");
				aux2 = entrada.next();

				System.out.println(estacionamento.horasaidaVeiculo(aux2));

			} else if (valor == 8) {
				System.out.println("Digite a placa do veículo, sair com o veiculo do estacionamento");
				aux2 = entrada.next();

				estacionamento.saidaVeiculo(aux2);

			} else {
				System.out.println("Digite uma entrada válida");
				System.out.println("Digite 1 para cadastro");
				System.out.println("Digite 2 para informacao do veículo");
				System.out.println("Digite 3 para informacao da pessoa");
				System.out.println("Digite 4 para vagas disponiveis");
				System.out.println("Digite 5 para vagas ocupadas");
				System.out.println("Digite 6 para hora da entrada do veiculo");
				System.out.println("Digite 7 para hora da saida do veiculo");
				System.out.println("Digite 8 sair  veiculo");

				valor = entrada.nextInt();

			}
			System.out.println("Digite 1 para cadastro");
			System.out.println("Digite 2 para informacao do veículo");
			System.out.println("Digite 3 para informacao da pessoa");
			System.out.println("Digite 4 para vagas disponiveis");
			System.out.println("Digite 5 para vagas ocupadas");
			System.out.println("Digite 6 para hora da entrada do veiculo");
			System.out.println("Digite 7 para hora da saida do veiculo");
			System.out.println("Digite 8 sair  veiculo");

			valor = entrada.nextInt();
		}

	}

}
