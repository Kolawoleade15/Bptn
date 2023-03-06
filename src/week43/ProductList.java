package week43;

import java.util.ArrayList;
import java.util.List;

class Products {
	int id;
	String name;
	double price;
	
	public Products(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		// TODO Auto-generated constructor stub
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	double getPrice() {
		return price;
	}
}


public class ProductList {
	
	static List<Products> generate() {
		
		List<Products> products = new ArrayList<>();
		
		return products;
	}

}
