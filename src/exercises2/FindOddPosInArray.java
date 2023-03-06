package exercises2;

public class FindOddPosInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("finding elements of given array occurs at odd position: ");
        for (int i = 0; i < arr.length; i++) 
        System.out.println(); 
        System.out.print("Odd Positions: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) { 
                System.out.print(arr[i] + " ");
            }
        }
    }

}