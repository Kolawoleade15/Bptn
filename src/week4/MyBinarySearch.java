package week4;

public class MyBinarySearch {
	public static void main(String[] args) {
		int[] input = {2,4,6,8,10,12,14,16};
		int key = 14;
		int start = 0;
		int end = input.length - 1;
		int index = -1;
		while(start <= end) {
			int mid = (start + end) / 2;
			if (key ==input[mid]) {
				index = mid;
				break;
			}
			else if (key < input[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		System.out.println("Key was found at position: " + index);
	}

}
