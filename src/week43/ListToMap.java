package week43;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {
    	 List<Student> students = new ArrayList<>();
        // Create a list of students
    	 students.add(new Student(1, "Alice", 20));
    	 students.add(new Student(2, "Bob", 22));
    	 students.add(new Student(3, "Charlie", 21));
        //add student objects to this list
    	 Map<Integer, Student> studentMap = students.stream()
    	            .collect(Collectors.toMap(Student::getId, student -> student));
        // Convert the list into a map with the student id as key
       
        // Print the map
        System.out.println("Students Map: "+ studentMap);
    }
}