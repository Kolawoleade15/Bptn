package week2;

class Car {
String color; String brand; int price;
public Car(String color, String brand, int price) {
       this.color = color;
       this.brand = brand;
       this.price = price;
}

    // Fill in the code
   void printCarDetails() {
       this.print();
      // fill in code
   }
    void print() {
       System.out.println("Car{" +
               "color='" + color + '\'' +
               ", brand='" + brand + '\'' +
               ", price=" + price +
               '}');
   }  
    public static void main(String[] args) {   
        Car car1 = new Car("white", "BMW", 70000);
        Car car2 = new Car("Red", "Audi", 80000);
        car1.printCarDetails();
        car2.printCarDetails();
    
 }
 
}