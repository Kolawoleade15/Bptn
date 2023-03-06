package exercises2;

class Vehicle {
	  private String color;
	  private String brand;
	  
	  public Vehicle(String color, String brand){
	      this.color = color;
	      this.brand = brand;
	  }
	    public void print(){
	      System.out.println("I am Vehicle class");
	  }
	}
	class Car extends Vehicle {
	    private String steeringWheel;

	public Car(String color, String brand, String steeringWheel){
	  super(color, brand);
	  this.steeringWheel = steeringWheel;
	}

	    @Override
	    public void print() {
	        System.out.println("I am car class");
	    }
	    
	}
	class Bike extends Vehicle {
	        private String bikeHandle;
	  
	    public Bike(String color, String brand, String bikeHandle){
	    super(color, brand);
	    this.bikeHandle = bikeHandle;
	    }
	    
	    @Override
	    public void print() {
	        System.out.println("I am bike class");
	    }
	
	   public static void main(String args[]) {
	       Vehicle vehicle  = new Vehicle("white", "toyota");
	       vehicle.print();
	       Car car = new Car("White", "Audi", "ChromeColored");
	       car.print();
	       Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
	       bike.print();
	   }
	}
