package week2;

public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub
        int inputNumber = 2579;
        int reversedValue = 0;
        int remainderValue;
 
        while(inputNumber != 0) {
            remainderValue = inputNumber % 10;
            reversedValue = reversedValue * 10 + remainderValue;
            inputNumber /= 10;
        }
 
        System.out.println("Reversed Value: " + reversedValue);
    }
}