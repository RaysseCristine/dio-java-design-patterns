package br.strategy;

import java.util.ArrayList;
import java.util.List;
 
public class ECommerceShopping {
	
	private List<ECommerceProduct> products = new ArrayList<>();	
	private DiscountStrategy discountStrategy = new DiscountStrategy();
	
	public void addProduct(ECommerceProduct product) {
		products.add(product);
	}
	
	public List<ECommerceProduct> getProduct() {
		return new ArrayList<>(products);
	}
	
	public double getTotal() {
		return products.stream().mapToDouble(ECommerceProduct::getPrice).sum();
	}
	
	public double getTotalWithDiscount() {
		return discountStrategy.getDiscount(this);
	}

	public void setDiscount(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
}
