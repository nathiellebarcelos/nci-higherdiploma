/*
 * @author: Nathiélle Barcelos
 * @date: 15/02/2021
 * Eggs.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

public class Eggs {
	
	private int eggsCollected, eggsLeft, numBoxes;
	private final int numEggsBoxes = 12;
	
	//Constructor
	public Eggs() {
	}
	
	//Compute methods
	public void computeEggsLeft() {
		eggsLeft = eggsCollected % numEggsBoxes;
	}
	
	public void computeNumBoxes() {
		numBoxes = eggsCollected / numEggsBoxes;	
		
	}
	
	//Getters and Setters
	public void setEggsCollected(int eggsCollected) {
		this.eggsCollected = eggsCollected;
	}
	
	
	public int getEggsleft() {
		return eggsLeft;
	}
	
	public int getNumBoxes() {
		return numBoxes;
	}
	
}
