package stock;

public class OutOfStockException extends Exception {
    // Custom exception class for when a product is out of stock
    public OutOfStockException(String message) {
        // Call the superclass constructor to pass the error message to the parent class
       super(message);
    }
}