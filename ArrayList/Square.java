/**
* author: Abdifatah Abdi
* This contains class Square
* toString() method that returns a string representation of the object.
*/


package ArrayList;

public class Square {
	
	private double side;//variable to keep track of the number of elements in the list
	   
	   public Square() {
	      side = 0;
	   }//end empty-argument constructor 
	   
	   public Square(double s) {
	      side = s;
	   }//end preferred constructor 
	   
	   public double getArea() {
	      return side * side;
	   }//end getArea
	   
	   
	   /**
		 * toString() method that returns a string representation of the object.
		 */
	   public String toString() {
	      return "Square with side = " + side + " and area = " + getArea();
	   }//end toString
	


}//end class


	
	


