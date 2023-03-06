package week31;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static class Student {

        private String name;
        private int classGrade;

        public Student(String name, int classGrade) {
            this.name = name;
            this.classGrade = classGrade;
        }

        public String getName() {
            return this.name;
        }

        public int getClassGrade() {
            return this.classGrade;
        }

        // overrides the default Object toString method;
        public String toString() {
            return "Student name is: " + name + " and student's class grade is: Grade " + classGrade;
        }

    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Student1", 80));
        studentList.add(new Student("Student2", 75));
        studentList.add(new Student("Student3", 86));
        studentList.add(new Student("Student4", 74));
        studentList.add(new Student("Student5", 92));
        studentList.add(new Student("Student6", 72));
        studentList.add(new Student("Student6", 60));

        List<Student> passList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getClassGrade() >= 75) {
                passList.add(student);
            }
        }
      // print out the students using array list forEach method
        passList.forEach(student -> System.out.println(student));
    }

}