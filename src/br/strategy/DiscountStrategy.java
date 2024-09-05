package br.strategy;

public class DiscountStrategy {
    protected double discount = 0.0;
    
    public double getDiscount(ECommerceShopping cart) {
        return cart.getTotal();
    }
}
