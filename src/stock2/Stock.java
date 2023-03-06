package stock2;

public class Stock {
    //create instance variables
   private String tickerSymbol;
    private String companyName;
   private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;
    //constructor
    public Stock (String tickerSymbol,String companyName,
    int price, int totalShares){
    this.tickerSymbol = tickerSymbol.toUpperCase();
    this.companyName = companyName;
    this.price = price;
    this.totalShares = totalShares;
    this.percentChange = 0;
    this.marketCap = totalShares * price;
    
    }
    //create the methods
   public void adjustPrice(int change) {
    this.price += change;
    this.percentChange = (change / (double)this.price) * 100;
    this.marketCap = Long.valueOf(totalShares) * Long.valueOf(price);
   }
   @Override
   public String toString(){
   return "Ticker Symbol: " + this.tickerSymbol + "\nCompany: " + this.companyName + "\nCurrent Price: $" + this.price + "("+ this.percentChange + "%)" + "\nMarket Cap: $" + this.marketCap;
   }
}
