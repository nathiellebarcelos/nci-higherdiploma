/*
 * @author: Nathiélle Barcelos
 * @date: 15/02/2021
 * Shop.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

public class Shop {
	//Class variables
	private int numCaps, numShirts, numHoodies,calcCaps, calcShirts, calcHoodies, totalCost;
	private final int caps = 5, shirts = 10, hoodies = 20; 

	//Constructor	
	public Shop() {
		
	}
	
	//Compute methods
	public void computeCalcCaps() {
		calcCaps = numCaps * caps;
		//System.out.println("in compute 1 " + calcCaps);
	}
	
	public void computeCalcShirts() {
		calcShirts = numShirts * shirts;
		//System.out.println("in compute 2 " + calcShirts);
	}
	
	public void computeCalcHoodies() {
		calcHoodies = numHoodies * hoodies;
		//System.out.println("in compute 3 " + calcHoodies);
	}
	
	public void computeTotalCost() {
		totalCost = calcCaps + calcShirts + calcHoodies;
		//System.out.println("in compute 4 "+ totalCost);
	}
	
	
	//Setters and Getters
	
	public void setNumCaps(int numCaps) {
		this.numCaps = numCaps;
	}
	
	public void setNumShirts(int numShirts) {
		this.numShirts = numShirts;
	}
	
	public void setNumHoddies(int numHoddies) {
		this.numHoodies = numHoddies;
	}
	
	public int getCalcCaps() {
		return calcCaps;
	}
	
	public int getCalcShirts() {
		return calcShirts;
	}
	
	public int getCalcHoodies() {
		return calcHoodies;
	}
	
	public int getTotalCost() {
		return totalCost;
	}
}
