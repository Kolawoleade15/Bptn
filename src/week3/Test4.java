package week3;

import java.util.*;

public class Test4 {
    public static void printEvenElements(ArrayList<Integer> list) {
        int element = 0;
        
        for (int i = 0; i < list.size(); i++) {
            element = list.get(i);
              if (element % 2 == 0) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 44, 7, 9, -16, 3, 2};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t 44, -16, 2,");
        System.out.print("Your Result:\t\t ");
        printEvenElements(values);
    }
}
//printing out all of the even Integers that are in the passed-in ArrayList