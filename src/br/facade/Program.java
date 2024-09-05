package br.facade;

public class Program {
	
	public static void main(String[] args) {
		ClienteBanco cliente = new ClienteBanco("Zoe");
		ContaBancaria conta = new ContaBancaria("1234-5");

		Facade facade = new Facade();
		facade.fazerDeposito(200.0, cliente, conta);
	}

}
