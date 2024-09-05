package br.strategy;

public class Main {

	public static void main(String[] args) {
		
		ECommerceShopping shoppingCart =  new ECommerceShopping();
		
		shoppingCart.setDiscount(new Discount());
        shoppingCart.setDiscount(new NewDiscount()); 
		
		shoppingCart.addProduct(new SimpleProduct("Produto 1", 50.0));
		shoppingCart.addProduct(new SimpleProduct("Produto 2", 50.0));
		shoppingCart.addProduct(new SimpleProduct("Produto 2", 50.0));
		
		System.out.println("Total: " + ((ECommerceShopping) shoppingCart).getTotal());
		System.out.println("Total com desconto: " + shoppingCart.getTotalWithDiscount());

	}
}
