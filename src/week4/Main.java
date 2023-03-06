package week4;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public void Start() {

		int[] array = { 3, 6, 1, 4, 2, 9, 7, 8, 5, 0 };
		int key = 1;

		Arrays.sort(array);

		// sort array
		int result = binarySearch(array, key);

		// Print values in array after sort
		System.out.println(result);

	}

	int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;

		while (high >= low) {
			int middle = (high + low) / 2;

			if (arr[middle] == key) {
				return middle;
			}

			if (arr[middle] < key) {
				low = middle + 1;
			}
			if (arr[middle] > key) {
				high = middle - 1;
			}
		}
		return -1;
		// put your code here.
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.Start();
	}
}