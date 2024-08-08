package br.singleton;

import java.util.ArrayList;
import java.util.List;

public class DatabaseClassic {

	private static DatabaseClassic instancia = null;
	private List<User> users = new ArrayList<>();
	
	public DatabaseClassic() {
	}
	
	public static DatabaseClassic getInstance() {
		if(instancia == null) {
			instancia = new DatabaseClassic();
		}
		return instancia;
	}
	
	public void adicionar(User user) {
		users.add(user);
	}
	
	public void remover(int index) {
		if(index >= 0 && index < users.size()) {
			users.remove(index);
		}
	}
	
	public void show() {
		for (User user: users) {
			System.out.println(user.getName() + ", " + user.getAge());
		}
	}
	
	 //Implementação de User
    public static class UserImpl implements User {
        private String name;
        private int age;

        public UserImpl(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getAge() {
            return age;
        }
    }
}
