package week1coding;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("/.....Calculator Menu...../");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Square");
            System.out.println("Press 6 for finding Square root");
            System.out.println("Press 7 for finding Reciprocal");
            int option = sc.nextInt();
        

             if (option == 1) {
                 System.out.println("Enter the first number");
                 double number1 = sc.nextDouble();
                 System.out.println("Enter the second number");
                 double secondNumber = sc.nextDouble();
            
                System.out.println("The sum of number " + number1 + "and" + secondNumber + "is = " + (number1 + secondNumber));
                System.out.println("To continue calculation Press 1 else press any button to exit");
                int press = sc.nextInt();
                if (press != 1)
                break;
                
               } else if (option == 2) {
                    System.out.println("Enter the first number");
                    double number1 = sc.nextDouble();
                    System.out.println("Enter the second number");
                    double secondNumber = sc.nextDouble();
                System.out.println("The subtraction of first and second second number" + number1 + "and " + secondNumber + " is = " + (number1-secondNumber));
                System.out.println("To continue calculation Press 1 else press any button to exit");
                int press = sc.nextInt();
                if (press !=1)
                break;

               }else if (option == 3) {
                   System.out.println("Enter the first number");
                   double number1 = sc.nextDouble();
                   System.out.println("Enter the second number");
                   double secondNumber = sc.nextDouble();
                System.out.println("The product of the numbers" + number1 + " and " + secondNumber + "is = " +(number1*secondNumber));
                System.out.println("To continue calculation Press 1 else press any button to exit");
                int press = sc.nextInt();
                if (press != 1)
                break;

               }else if (option == 4){
                   System.out.println("Enter the first number");
                   double number1 = sc.nextDouble();
                   System.out.println("Enter the second number");
                   double secondNumber = sc.nextDouble();
                System.out.println("The division of the numbers" + number1 + "and " + secondNumber + " is = " + (number1/secondNumber));
                System.out.println("To continue calculation Press 1 else press any button to exit");
                int press = sc.nextInt();
                if (press != 1)
                break;

               }else if (option == 5){
                   System.out.println("Enter the number to find Square");
                   double number = sc.nextDouble();
                System.out.println("The Square of the number " + number +  " is = " + (number*number));
                System.out.println("To continue calculation Press 1 else press any button to exit");
                int press = sc.nextInt();
                if (press != 1)
                break;
                            
               }else if (option == 6){
                 System.out.println("Enter the number to find the Square root");
                 double number = sc.nextDouble();
                System.out.println("The square root of the number " + number + " is = " + Math.sqrt(number)) ;
                System.out.println("To continue calculation Press 1 else press any button to exit");
                int press = sc.nextInt();
                if (press != 1)
                break;
                
                } else if (option == 7) {
                    System.out.print("Enter the number: ");
                    double number = sc.nextDouble();
                    System.out.println("The Reciprocal of the number " + number + " is = " + (1 / number));
                    System.out.println("To continue calculation Press 1 else press any button to exit");
                    int press = sc.nextInt();
                    if (press != 1)
                    break;
                   
                }else {
                    System.out.println("Invalid option");                    
            }
                            
         } sc.close();
       }

    }