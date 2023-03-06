package stock;

import java.util.HashMap;
import java.util.Map;

public class Store {
    //create the map
    private Map<String, Integer> products;
    public Store() {
        // Initialize the products map with default values
     products = new HashMap<>();
     products.put("apple", 10);
     products.put("banana", 5);
     products.put("orange", 0);   
    }

    public void purchase(String product, int quantity) throws OutOfStockException {
        // Check if the product is available in the store
        if (!products.containsKey(product)){
             throw new OutOfStockException("Product " + product + " not available in store");
            // If not, throw an OutOfStockException with a message indicating the product is not available  
        }
        int inStock = products.get(product);
        // Check if there is enough stock for the desired quantity
        if (quantity > inStock){
            throw new OutOfStockException("Product " + product + " out of stock");
            // If not, throw an OutOfStockException with a message indicating the product is out of stock
            
        }
    }
}