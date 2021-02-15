/*
 * @author: Nathiélle Barcelos
 * @date: 15/02/2021
 * CalculatorApp.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

import java.util.Scanner;

public class CalculatoApp {
	
	public static void main (String args[]) {
		//Declare variables
		int x, y, sum, diff;
		
		//Create objects
		Scanner sc = new Scanner(System.in);
		Calculator myCalc = new Calculator();
		
		//Input
		System.out.println("Please enter a number");
		x = sc.nextInt();	
		
		System.out.println("Please enter a number");
		y = sc.nextInt();
		
		//Setting the values
		myCalc.setX(x);
		myCalc.setY(y);
		
		//Compute
		myCalc.computeSum();
		myCalc.computeDiff();
		
		//Fetch results and output
		sum = myCalc.getSum();
		diff = myCalc.getDiff();
		
		System.out.println("The 2 numbers " + x + " and " + y + " , added = " + sum + " and subtracted = " + diff);
		
	}//main

}//class
