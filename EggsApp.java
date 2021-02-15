/*
 * @author: Nathiélle Barcelos
 * @date: 15/02/2021
 * EggsApp.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

import java.util.Scanner;

public class EggsApp {
	
	public static void main (String agrs[]) {
		
		//Declare variables
		int eggsCollected, eggsLeft, numBoxes;
		
		//Create objects
		Scanner sc = new Scanner(System.in);
		Eggs eggsCalc = new Eggs();
		
		//Input
		System.out.println("Please enter number of eggs collected: ");
		eggsCollected = sc.nextInt();
		
		//Setting the values
		eggsCalc.setEggsCollected(eggsCollected);
		
		//Compute
		eggsCalc.computeEggsLeft();
		eggsCalc.computeNumBoxes();
		
		//Fetch results and output
		eggsLeft = eggsCalc.getEggsleft();
		numBoxes = eggsCalc.getNumBoxes();
		
		System.out.println("Joe collected a number of " + eggsCollected + " eggs, he will need " + numBoxes + " box(es). It has left " + eggsLeft + " eggs. ");
		
	}//main
}//class
