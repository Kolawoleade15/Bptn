package exercises2;

class Employee {

    private double salary;
    private double hoursPerDay;

   public Employee(double salary, double hoursPerDay) {
       setSalary(salary);
       setHoursPerDay(hoursPerDay);
   }  
   public void setSalary(double salary) {
       if (salary < 500) {
           this.salary = salary + 10;
       } else {
           this.salary = salary;
       }
   } 
   public void setHoursPerDay(double hoursPerDay) {
       if (hoursPerDay > 6) {
           this.salary = salary + 5;
       } else {
           this.salary = salary;
       }
   }
public double getSalary() {
    return salary;
}
   

   // set method to update salary
   

   // set method to update hoursPerDay
   

   // get method to return salary
   

   public static void main(String[] args) {
       // create an instance of Employee class and initialize it with salary = 100 and hoursPerDay = 8
       Employee student = new Employee(100, 8);
       
       // print the salary of the employee
       System.out.println(student.getSalary());
   }
}
