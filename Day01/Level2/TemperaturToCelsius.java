import java.util.*;
class TemperatureToCelcius{ //class Fahrenheit
    public static void main(String args[]){ //main function
	    Scanner sc = new Scanner(System.in); //Scanner class object
		System.out.println("Enter temperature in fahrenheit");
        // 1 input variable for temperature in Celsius 
		double fahrenheit = sc.nextDouble();
        // conversion to Celsius
		double celsius =  (fahrenheit -32) + (double)5/(double)9;
		System.out.println("Temperature in Fahrenheit is  "+ fahrenheit); // Temperature in Fahrenheit
		}
}
