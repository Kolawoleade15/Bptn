package week31;

import java.util.*;
public class HashSetManipulation1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        
        System.out.println("Set size:" + set.size());
        Iterator<String>iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println("Value:" +  iterator.next());
        }
        set.add("D");
        System.out.println("Set after using add()");
        for (String value : set) {
            System.out.println("Value: " + value);
        }
        set.remove("A");
        System.out.println("Set after using remove(): ");
        for (String value : set) {
            System.out.println("Value: " + value);
        }
        boolean exists = set.contains("C");
        System.out.println("Value 'C' exists in the set ");
    }
}      
