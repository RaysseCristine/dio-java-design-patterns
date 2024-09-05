package br.strategy;

public interface ECommerceProduct {
	
	String getName();
	Double getPrice();

}
	class SimpleProduct implements ECommerceProduct {
    private String name;
    private double price;

    SimpleProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
