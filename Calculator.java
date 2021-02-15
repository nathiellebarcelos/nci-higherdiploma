/*
 * @author: Nathiélle Barcelos
 * @date: 15/02/2021
 * Calculator.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

public class Calculator {
	
	//Class variables
	private int x, y, sum, diff;
	
	//Constructor
	public Calculator() {
		
	}
	
	public Calculator(int x) {
		this.x = x;
	}
	
	public Calculator(int x, int y, int sum, int diff) {
		this.x = x;
		this.y = y;
		this.sum = sum;
		this.diff = diff;	
	}
	
	//Compute methods
	public void computeSum() {
		sum = x + y;
	}
	
	public void computeDiff() {
		diff = x - y;
	}
	
	
	//Getters and Setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int getDiff() {
		return diff;
	}
}//class
