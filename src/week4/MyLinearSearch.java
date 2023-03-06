package week4;

public class MyLinearSearch {
	
public static void main(String[] args) {
	int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
	int key = 99;
	int index = -1;
	for (int i = 0; i < input.length; i ++) {
		if (input[i] == key) {
			index = i;
			break;
		}
		
	}
	System.out.println("Key was found at position: " + index);
}
}
