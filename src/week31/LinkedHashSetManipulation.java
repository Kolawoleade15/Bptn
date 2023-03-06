package week31;

import java.util.*;
public class LinkedHashSetManipulation {
	public static void main(String[] args) {
		// Create a LinkedHashSet and populate it with initial elements
	LinkedHashSet<String> set = new LinkedHashSet<>();
    set.add("A");
    set.add("B");
    set.add("C");
    // Print the size of the set
		System.out.println("Set size: " + set.size());
		// Use for each loop to print the elements in the set
		System.out.println("Elements in the set (using for-each loop): ");
        for (String element : set) {
            System.out.println("Element: " + element);
        }
		// Use iterator to print the elements in the set
		System.out.println("Elements in the set (using iterator): ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
		// Use remove() method to remove an element from the set
		set.remove("A");
        System.out.println("Set after using remove(): " + set);
        
		// Use contains() method to check if an element exists in the set
        boolean exists = set.contains("B");
        System.out.println("Element 'B' exists in the set.");
		// Use clear() method to remove all elements from the set
        set.clear();
        System.out.println("Set after using clear(): " + "[]" );
	}
}

//Manipulation on LinkedHashSet