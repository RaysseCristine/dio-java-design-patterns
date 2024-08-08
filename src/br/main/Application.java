package br.main;

import br.singleton.DatabaseClassic;

public class Application {
	public static void main(String[] args) {
		
		// Obtendo a inst�ncia �nica do banco de dados
        DatabaseClassic database = DatabaseClassic.getInstance();
		 
		// Adicionando usu�rios � base de dados
        database.adicionar(new DatabaseClassic.UserImpl("Luiz", 30));
        database.adicionar(new DatabaseClassic.UserImpl("Maria", 20));
        database.adicionar(new DatabaseClassic.UserImpl("Ana", 25));

       database.show();
       
       System.out.println();
       
       database.remover(0);
       database.show();
	}

}

