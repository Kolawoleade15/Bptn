package exercises;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i < 5; i++) {
            arr.add(i);
        }
        for(int i = arr.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println("Removing element " + i + " : " + arr.get(i));
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
//Reversing array in the reverse order so that the indices of the elements that have not been removed remain constant