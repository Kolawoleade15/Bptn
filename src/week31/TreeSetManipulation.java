package week31;

import java.util.TreeSet;

public class TreeSetManipulation {
    public static void main(String[] args) {
        // Create a TreeSet and populate it with initial elements
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        // Print the size of the set
        System.out.println("Set size: " + set.size());
        // Print the elements in the set
        System.out.println("Elements in set: " + set);
        // Use first() and last() methods to get the first and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Use headSet() and tailSet() methods to get the elements in the set that are less than or greater than a specific element
        System.out.println("Elements less than 'B': " + set.headSet("B"));
        System.out.println("Elements greater than 'B': " + set.tailSet("B"));

        // Use subSet() method to get the elements in the set that are greater than or equal to a lower bound and less than an upper bound
        System.out.println("Elements between 'A' and 'C': " + set.subSet("A", "C"));

        // Use contains() method to check if a specific element exists in the set
        System.out.println("Does set contain 'B'? " + set.contains("B"));

        // Use remove() method to remove a specific element from the set
        set.remove("B");
        System.out.println("Set after removing 'B': " + set);
    }
}
