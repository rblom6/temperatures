/* This program 
 * 
 * 
 */

package com.temperatures;

import java.util.Scanner;

public class Temperatures{

	public static double toCelsius(double f){
		double c;
		c = (f-32)/1.8;
				
		return c;
	}
	
	public static double toFahrenheit(double c) {
		double f;
		f = (c*1.8) + 32;
		
		return f;
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double temperature;
		while(true) {
			System.out.println("\nEnter 'c' if you want to convert to Celsius.");
			System.out.println("Enter 'f' if you want to convert to Fahrenheit.");
			System.out.println("Enter 'e' to exit the program.  ");
			System.out.println("Enter your option here: ");
			String convertTo = scan.nextLine();
			
			if(convertTo.toLowerCase().equals(Character.toString('c'))) {
				System.out.println("Enter your Fahrenheit value: ");
				temperature = scan.nextDouble();
				scan.nextLine();
				System.out.printf("%.2f degrees Fahrenheight is %.2f degrees Celsius! \n", temperature, Temperatures.toCelsius(temperature));
				
			}else if(convertTo.toLowerCase().equals(Character.toString('f'))) {
				System.out.println("Enter your Celsius value: ");
				temperature = scan.nextDouble();
				scan.nextLine();
				System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit! \n", temperature, Temperatures.toFahrenheit(temperature));
				
			}else {
				System.out.println("Exiting the program...");
				break;
			}
		}
		
		System.out.println("Bye!");
		
	}

}
