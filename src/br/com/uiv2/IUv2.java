package br.com.uiv2;

import java.util.Scanner;

import br.com.objv2.*;

public class IUv2 {
	private Scanner entrada = new Scanner(System.in);
	private Integer parada = 98989386;

	public IUv2() {
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
		Double aux4;
		System.out.println("Digite o tamanho do estacionamento");
		aux = entrada.nextInt();
		System.out.println("Digite o valor do estacionamento, por segundos");
		aux4 = entrada.nextDouble();
		estacionamento = new Estacionamento(aux, aux4);

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
		opcoesMenu();

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

				estacionamento.informacaoVeiculo(aux2);

			} else if (valor == 3) {
				System.out.println("Digite o nome da pessoa");
				aux2 = entrada.next();

				estacionamento.infoPessoa(aux2);

			} else if (valor == 4) {
				System.out.println(estacionamento.vagasDisponivel());

			} else if (valor == 5) {
				estacionamento.vagasOcupadas();

			} else if (valor == 6) {
				System.out.println("Digite a placa do veículo, para localizarmos a hora de entrada");
				aux2 = entrada.next();

				estacionamento.horaentradaVeiculo(aux2);

			} else if (valor == 7) {
				System.out.println("Digite a placa do veículo, para localizarmos a hora de saida");
				aux2 = entrada.next();

				estacionamento.horasaidaVeiculo(aux2);

			} else if (valor == 8) {
				System.out.println("Digite a placa do veículo, sair com o veiculo do estacionamento");
				aux2 = entrada.next();

				estacionamento.saidaVeiculo(aux2);

			} else if (valor == 9) {

				estacionamento.imprimehistorico();

			} else if (valor == 10) {

				estacionamento.saidahistorico();
			} else if (valor == 11) {
				System.out.println("Digite a vaga");

				int aux3 = entrada.nextInt();

				System.out.println(estacionamento.retornaCarroDadoAvaga(aux3));

			} else if (valor == 12) {
				System.out.println("Digite a placa");

				aux2 = entrada.next();
				System.out.println(estacionamento.retornaVagaDadaAplaca(aux2));

			} else if (valor == 13) {

				System.out.println("O valor do caixa do estacionamento e R$" + estacionamento.caixaEstacionamento());

			} else {
				opcoesMenu();

				valor = entrada.nextInt();

			}
			opcoesMenu();

			valor = entrada.nextInt();
		}

	}

	public void opcoesMenu() {
		System.out.println("Digite 1 para cadastro");
		System.out.println("Digite 2 para informacao do veículo");
		System.out.println("Digite 3 para informacao da pessoa");
		System.out.println("Digite 4 para vagas disponiveis");
		System.out.println("Digite 5 para vagas ocupadas");
		System.out.println("Digite 6 para hora da entrada do veiculo");
		System.out.println("Digite 7 para hora da saida do veiculo");
		System.out.println("Digite 8 sair  veiculo");
		System.out.println("Digite 9 para historico de saida do estacionamento");
		System.out.println("Digite 10 para historico do estacionamento - vagas ocupadas serao exibidas primeiro");
		System.out.println("Digite 11 a vaga pra identificar o veiculo que ocupa essa vaga");
		System.out.println("Digite 12 a placa do veículo, para identificar qual vaga ele ocupa");
		System.out.println("Digite 13 imprime o valor do caixa");

	}

}
