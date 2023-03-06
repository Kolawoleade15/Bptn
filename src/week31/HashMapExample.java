package week31;

import java.util.HashMap;


public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap and populating it with initial key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John",25);
        map.put("Jane", 30);
        map.put("Jack", 35);

        // Using the forEach() method and a lambda expression to iterate over the map
        map.forEach((key, value) -> System.out.println(key + ": " + value));

        // Using the compute() method to update the value for a given key
        map.compute("John", (k, v) -> v + 5);
        System.out.println("John's new age: " + map.get("John"));

        // Using the replaceAll() method to update all values in the map using a lambda expression
        map.replaceAll((k, v) -> v + 5);
        System.out.println("Jane's new age: " + map.get("Jane"));

        // Using the putIfAbsent() method to add a key-value pair only if the key is not present in the map
        map.putIfAbsent("Mike", 42);
        System.out.println("Mike's age: " + map.get("Mike"));

        // Using the merge() method to combine two key-value pairs
        map.merge("John", 30, (a, b) -> a + b);
        System.out.println("John's new age: " + map.get("John"));
    }
}