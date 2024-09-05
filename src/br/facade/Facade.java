package br.facade;

public class Facade {
	private ClienteBanco cliente;
	private ContaBancaria conta;
	
	public ClienteBanco getCliente() {
		return cliente;
	}

	public void setCliente(ClienteBanco cliente) {
		this.cliente = cliente;
	}

	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	public Facade() {
		this.cliente = new ClienteBanco();
		this.conta = new ContaBancaria();
	}
	
	public void fazerDeposito(double quantidade, ClienteBanco cliente, ContaBancaria conta) {
		System.out.printf("Olá, o beneficiário de seu depósito é o(a) cliente %s\n",cliente.nomeCliente());
		System.out.printf("Você escolheu a conta %s\n", conta.obterNumeroConta());
		System.out.printf("O saldo desta conta é: %.2f\n", conta.obterSaldo());
		System.out.printf("Você está depositando R$ %.2f\n", quantidade);
		conta.setSaldo(conta.getSaldo() + quantidade);
		System.out.printf("Depositado R$ %.2f na conta de %s\n",quantidade, cliente.nomeCliente());
		System.out.printf("O saldo desta conta é: R$ %.2f\n", conta.obterSaldo());
	}

}
