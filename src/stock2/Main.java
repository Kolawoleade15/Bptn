package stock2;

public class Main {
	  public static void main(String[] args) {
	        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
	        System.out.println(stock);
	        stock.adjustPrice(20);
	        System.out.println(stock);
	    }
	  }
