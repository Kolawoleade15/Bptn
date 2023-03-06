package week3;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3};
         for (int num : nums) {
            values.add(num);
        }
        System.out.println("Expected Result:\t [1, 44, 7, 9, -16, 3]");
        System.out.println("Your Result:\t\t " + values);
    }
}
//filling the ArrayList values with the elements of the array nums using a for-each loop