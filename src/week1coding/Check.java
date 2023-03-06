package week1coding;

import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("/.....String Menu...../");
        System.out.println("Press 1 for Palindrome Check ");
        System.out.println("Press 2 to reverse a String ");
        System.out.println("Press 3 to Concatenate two Strings ");
        System.out.println("Press 4 for String Comparison ");
        System.out.println("Press 5 to Calculate the Length of String ");
        System.out.println("Enter the option: ");
        int option = sc.nextInt();
        sc.nextLine();
        
        if (option == 1){
            System.out.print("Please enter a string: ");
            String original = sc.nextLine();
            String reverse = "";
            for (int i = original.length() - 1; i >=0; i--)
            reverse += original.charAt(i);
            if (original.equals(reverse))
            System.out.println("The input string is a palindrome.");
            else
            System.out.println("The input string is not a palindrome. ");
         break;
        }else if (option == 2) {
      
        System.out.println("Enter String to be reversed: ");
        String original2 = sc.nextLine();
        String reversed = "";
        for (int i = original2.length() - 1; i >=0; i--)
        reversed += original2.charAt(i);
        System.out.println("The reverse of the String is:" + reversed);
        break;

        }else if (option == 3) {
        System.out.println("Enter first String: ");
        String firstString = sc.nextLine();
        System.out.println("Enter second String: ");
        String secondString = sc.nextLine();
        String thirdString = firstString + secondString;
        System.out.println("Concatenation of the two Strings is = " + thirdString);
        break;

        }else if (option ==4){

        System.out.println("Enter the first String: ");
        String string1 = sc.nextLine();
        System.out.println("Enter the second String: ");
        String string2 = sc.nextLine();
        if (string1.equals(string2)){
            System.out.println("The entered strings are equal.");
        }else{
            System.out.println("The entered strings are not equal. ");
        } break;
        }else if (option ==5) {
            
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int length = str.length();
        System.out.println("The length of String is:" + length);
        break;
        }else 
        System.out.println("Invalid input ");
        
        sc.close();
        }
        }

            
    }