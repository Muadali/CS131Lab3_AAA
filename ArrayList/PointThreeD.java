/**
* author: Abdifatah Abdi
* This contains class PointThreeD
* toString() method that returns a string representation of the object.
*/


package ArrayList;

public class PointThreeD {
	
	private double xPoint;//variable to keep track of the number of elements in the list
	   private double yPoint;//variable to keep track of the number of elements in the list
	   private double zPoint;//variable to keep track of the number of elements in the list
	   
	   public PointThreeD(double x, double y, double z) {
	      xPoint = x;
	      yPoint = y;
	      zPoint = z;
	   }//end constructor 
	   
	   
	   /**
		 * toString() method that returns a string representation of the object.
		 */
	   public String toString() {
	      return "Point at (" + xPoint + ", " + yPoint + ", " + zPoint + ")";
	   }//end toString
	

}//end class

