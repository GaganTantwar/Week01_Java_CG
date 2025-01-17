import java.util.*;
public class EmployeeBonus {
  public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner sc = new Scanner(System.in);
    // Take user input for the salary
    System.out.print("Enter the employee's salary:  ");
    double employeeSalary = sc.nextDouble();
    // Take user input for the years of service
    System.out.print("Enter the employee's years  of service: ");
    int yearsOfService = sc.nextInt();
    // Initialize the bonus amount
    double bonusAmount = 0.0;
  
    // Check if the years of service is more than  5 years
    if (yearsOfService > 5) {
      // Calculate the bonus as 5% of the salary
      bonusAmount = employeeSalary * 0.05;
    }
    // Print the bonus amount
    System.out.println("The bonus amount is " + bonusAmount);
    // Close the scanner object
    sc.close();
  }
}