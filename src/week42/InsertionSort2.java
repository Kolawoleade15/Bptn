package week42;

import java.util.Arrays;

public class InsertionSort2 {

	public static void main(String[] args) {

		int[] array = { 3, 6, 1, 4, 5 };
		System.out.println(Arrays.toString(insertionSort2(array)));
	}

	public static int[] insertionSort2(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int itemToInsert = input[i];
			int indexToCheckForSwap = i - 1;
			
			while(indexToCheckForSwap >= 0 && input[indexToCheckForSwap] > itemToInsert) {
			
				// shift
				input[indexToCheckForSwap + 1] = input[indexToCheckForSwap];
				indexToCheckForSwap--;
				
			}
			input[indexToCheckForSwap + 1] = itemToInsert;
		}
		return input;

	}
}
