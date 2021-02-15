/*
 * @author: Nathiélle Barcelos
 * @date: 15/02/2021
 * ShopApp.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

import java.util.Scanner;

public class ShopApp {
	
	public static void main (String args[]) {
		//Declare variables
		int numCaps, numShirts, numHoodies,calcCaps, calcShirts, calcHoodies, totalCost;
		
		//Create objects
		Scanner sc = new Scanner(System.in);
		Shop myShop = new Shop();
		
		//Input
		System.out.println("Please enter the number of caps you are buying: ");
		numCaps = sc.nextInt();
		
		System.out.println("Please enter the number of shirts you are buying: ");
		numShirts = sc.nextInt();
		
		System.out.println("Please enter the number of hoodies you are buying: ");
		numHoodies = sc.nextInt();
		
		//Setting the values
		myShop.setNumCaps(numCaps);
		myShop.setNumShirts(numShirts);
		myShop.setNumHoddies(numHoodies);	
		
		//Compute
		
		myShop.computeCalcCaps();
		myShop.computeCalcShirts();
		myShop.computeCalcHoodies();
		myShop.computeTotalCost();
		
		
		//Fetch results and output
		calcCaps = myShop.getCalcCaps();
		calcShirts = myShop.getCalcShirts();
		calcHoodies = myShop.getCalcHoodies();
		totalCost = myShop.getTotalCost();
		
		System.out.println("They are buying " + numCaps + " Caps(€5 each), " + numShirts + " Shirts(€10 each) and " + numHoodies + " Hoodies(€20 each). The costs total is: €" + totalCost);
		
		
	}//main
}//class
