import java.io.*;
public class EmployeeTest {

   public static void main(String args[]) {
      /* Create two objects using constructor */
      Employee empOne   = new Employee("Moondust");
      Employee empTwo   = new Employee("Run fast as you can");
      Employee empThree = new Employee("burn Motherfucker");

      // Invoking methods for each object created
      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      empTwo.printEmployee();

      empThree.empAge(21);
      empThree.empDesignation("Software Engineer");
      empThree.empSalary(500);
      empThree.printEmployee();
   }
}
