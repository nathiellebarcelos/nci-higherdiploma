/*
 * @author: Nathiélle Barcelos
 * @date: 09/02/2021
 * StudentApp.java
 * Software Development with Java
 * National College of Ireland - Higher Diploma in Computing Science 
 */

public class StudentApp {
	
	public static void main (String args[]) {
		
		String name;
		int ID, numCredits, numPoints, gpa;
		
		Student nathielle = new Student("Nathielle", 7564, 45, 6);
		
		
		nathielle.compute();
		System.out.println("Student Nathielle = " + nathielle.toString());
		
	}//main

}//class
