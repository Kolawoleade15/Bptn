package exercises;

import java.util.Scanner;

 public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scan.nextInt();
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to 0: " + steps);
    }
public static int numberOfSteps (int num) {
      int steps = 0;
    for (; num != 0; steps++) {
         if (num % 2 == 0) {
             num /= 2;
            } else {
                num -= 1;
            }
        }
        return steps;
    }
}
