package wordfrequency;

class SumCalculator extends Thread {
    // The start point of the range 
    private int start;
    // The end point of the range 
    private int end;
    // The sum of the numbers in the range
    private int sum;

    // Constructor to set the start and end points of the range
    public SumCalculator(int start, int end) {
        this.start = start;
        this.end = end;
         //Initialize the instance variables start and end
        this.sum = 0;
        // Initialize the sum to 0
    }

    // Override the run method to calculate the sum of the numbers in the range
    @Override
    public void run() {
        for (int i = start; i<=end; i++) {
            sum += i;
        }
        // Iterate through the numbers in the range and add them to the sum
       
    }

    // Method to get the sum of the numbers in the range
    public int getSum() {
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two SumCalculator threads to calculate the sum of two different ranges
        SumCalculator sumCalculator1 = new SumCalculator(1, 50);
        SumCalculator sumCalculator2 = new SumCalculator(51, 100);
        // Start both threads
       sumCalculator1.start();
       sumCalculator2.start();

        // Wait for both threads to finish using join() method
        try {
            sumCalculator1.join();
            sumCalculator2.join();
        } catch (InterruptedException e) {
            // Print the stack trace if an interruption occurs
            e.printStackTrace();
        }

        // Calculate the total sum by adding the sum of both ranges
        int totalSum = sumCalculator1.getSum() + sumCalculator2.getSum();
        // Print the total sum
        System.out.println("Total sum: " + totalSum);
    }
}
