import java.util.*;

public class AgeCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for the age
        System.out.print("Enter the person's age: ");
        int personAge = scanner.nextInt();
        
        // Check if the person's age is greater than or equal to 18
        if (personAge >= 18) {
            System.out.println("The person's age is " + personAge + " and they can vote.");
        } 
      else {
            System.out.println("The person's age is " + personAge + " and they cannot vote.");
        }
        
        // Close the scanner object

        scanner.close();
    }
}