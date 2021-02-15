/*
 * @author: Nathiélle Barcelos
 * @date: 09/02/2021
 * Student.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

public class Student {
	
	//private date members
	private String name;
	private int ID, numPoints, numCredits;
	private double gpa;
	
	//Constructors
	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, int ID, int numCredits, int numPoints) {
		this.name = name;
		this.ID =ID;
		this.numPoints = numPoints;
		this.numCredits = numCredits;
	}
	

	//Getters
	public double getGpa(){
		return gpa;
	}
	
	public void compute() {
		System.out.println("in compute NP: " + numPoints + " NC: " +numCredits);
		gpa = numCredits/numPoints;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public void setNumPoints(int numPoints) {
		this.numPoints = numPoints;
	}
	
	public void setNumCredits(int numCredits) {
		this.numCredits = numCredits;
	}
	
	public String toString(){
        return "Student{Name: " + name + ", IDNumber: " + ID + ", numCredits: " + numCredits +
                ", numPoints: " + numPoints + ", GPA = " + gpa + "}";
    }

}//class