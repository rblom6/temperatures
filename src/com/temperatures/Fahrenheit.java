package com.temperatures;

public class Fahrenheit{

	public static double toCelsius(double f){
		double c;
		c = (f-32)/1.8;
	
		// round the value
		//c = Math.round(c*100)/100;
				
		return c;
	}
	
	public static void main(String args[]) {
		double fahrenheit_temp = 85;
		System.out.println("85 degrees Fahrenheight is " + Fahrenheit.toCelsius(fahrenheit_temp) + " degrees Celsius!");
	}

}
