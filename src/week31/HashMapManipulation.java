package week31;

import java.util.*;
public class HashMapManipulation {
	
	public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
		// Create a HashMap and populate it with initial key-value pairs
        System.out.println("Map size:" +  map.size());
        
		// Print the size of the map
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "," + "Value:" + entry.getValue());
        }
		// Use a for loop to print the key-value pairs in the map
		int value = map.get("A");
        System.out.println("Value of key 'A':" + value);
		// Use get() method to get the value of key "A"
        map.put("D", 4);
        System.out.println("Map after adding a new key-value pair:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            
            System.out.println("Key: " + entry.getKey() + "," + "Value:" + entry.getValue());
 
        // use put() method to add a new key-value pair to the map
		

		// Use the containsKey() method to check if the key "C" exists in the map
        }
        boolean exists = map.containsKey("C");
        System.out.println("Key 'C' exists in the map ");

	}
}