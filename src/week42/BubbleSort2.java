package week42;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {

		int[] array = { 3, 6, 1, 4 };
		System.out.println("Before sort: " + Arrays.toString(array));
		boolean swappedSomething = false;
		int end = array.length - 1;

		do {
			swappedSomething = false;
			for (int i = 0; i < end; i++) {

				if (array[i] > array[i + 1]) {
					// swap
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swappedSomething = true;
				}
			}
			end--;
		} while (swappedSomething);
		System.out.println("After sort: " + Arrays.toString(array));
	}
}
