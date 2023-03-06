package week42;

import java.util.Arrays;

public class MySelectionSort {
	static void selectionSort(int[]a) {
		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j= i +1; j < a.length; j++ ) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		int [] a = {3,86,-20,14,40,-50};
		System.out.println(Arrays.toString(a));
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
//to sort in ascending order, simply change the sign of the comparison	