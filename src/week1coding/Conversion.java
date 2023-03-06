package week1coding;

import java.util.Scanner;
public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value to be converted to meters");
        double inch = scanner.nextDouble();
        double meters = inch * 0.0254; 
        System.out.println(inch + " inches equals to " + meters + " " +"meters");
        
        scanner.close();
    }
    
}
