package br.facade;

public class ContaBancaria {
	
	private String conta;
	private double saldo;
	
	public ContaBancaria(){}

	public ContaBancaria(String conta){
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double setSaldo(double saldo) {
		this.saldo = saldo;
		return saldo;
	}
	
	public double depositar(double valor) {
		System.out.println("Depositando...");
		return this.setSaldo(this.getSaldo() + valor);
	}
	
	public String obterNumeroConta() {
		System.out.println("Obtendo número da conta...");
		return this.conta;
	}
	
	public double obterSaldo() {
		System.out.println("Obtendo saldo...");
		return this.getSaldo();
	}

}
