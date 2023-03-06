package palidrone;

public class Main {
	  public static boolean isPalindrome(int inputNumber) {
	    int originalNumber = inputNumber;
	    int reversedNumber = 0;
	    int remainderNumber;

	    while (inputNumber != 0) {
	      remainderNumber = inputNumber % 10;
	      reversedNumber = reversedNumber * 10 + remainderNumber;
	      inputNumber = inputNumber / 10;
	    }

	    return originalNumber == reversedNumber;
	  }

	  public static void main(String[] args) {
	    int inputNumber = 1001;
	    if (isPalindrome(inputNumber)) {
	      System.out.println("The number " + inputNumber + " is a palindrome.");
	    } else {
	      System.out.println("The number " + inputNumber + " is not a palindrome.");
	    }
	  }
	}
