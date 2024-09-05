package br.facade;

public class ClienteBanco {
	
	private String nome;
	
	public String nomeCliente() {
		return this.nome;
	}
	
	public ClienteBanco(){}
	
	public ClienteBanco(String nome) {
		this.nome = nome;
	}

}
