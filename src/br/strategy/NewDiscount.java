package br.strategy;

public class NewDiscount extends DiscountStrategy{
	
	protected double discount = 0;
	
	public double getDiscount(ECommerceShopping cart) {
		double total = cart.getTotal();
		
		if(total >= 150) {
			this.discount = 5;
		}
		
		return total - total * (this.discount / 100);
	}
}
