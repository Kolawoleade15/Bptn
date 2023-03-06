package week2;

class Car1 {
	   String color;
	   String brand;
	   int price;

	  
	   Car1(){
	       this.color = "Black";
	       this.brand = "Tesla";
	       this.price = 9000;
	     
	   }
	// calls the parametrized constructor
	   public Car1(String color, String brand, int price) {
	       this.color = color;
	       this.brand = brand;
	       this.price = price;
	   }

	   void printCarDetails() {
	       this.print();
	   }

	   private void print() {
	       System.out.println(color +" " + brand + " " + price);
	   }
	   public static void main(String[] args) {
		    Car1 defaultCar = new Car1();
		    defaultCar.printCarDetails();
		}

	}
