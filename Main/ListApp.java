/**
* author: Abdifatah Abdi
* This contains class listApp that will test all our methods.
* Three different lists are instantiated: a list of Strings, a list of Squares, and a list of Points.
* 
*/


package Main;

import java.util.ArrayList;

import ArrayList.PointThreeD;
import ArrayList.Square;

public class ListApp {
	
	public static void main(String [] args)
	   {
	      ArrayList<Square> squareList = new ArrayList<Square>();
	      ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();
	      ArrayList<String> stringList = new ArrayList<String>();
	      
	      System.out.println("Adding items to the lists\n");
	      
	      for(int i = 1; i <= 10; i++) {
	    	  
	         if(squareList.addItem(new Square(i))){
	        	 
	            System.out.println("Added square " + i);
	            }
	         else {
	            System.out.println("Could not add square " + i);
	         }
	      }
	      
	      for(int i = 1; i <= 10; i++) {
	    	  
	         if(pointList.addItem(new PointThreeD(i, i * 2, i * 3)))
	         {
	            System.out.println("Added point " + i);
	         }
	         else
	         {
	            System.out.println("Could not add point " + i);
	         }
	      }
	      
	      for(int i = 1; i <= 10; i++)
	      {
	         if(stringList.addItem("String " + i))
	         {
	            System.out.println("Added string " + i);
	         }
	         else
	         {
	            System.out.println("Could not add string " + i);
	         }
	      }
	      
	      System.out.println("\nPrinting out contents of the lists\n");
	      System.out.println("Square List");
	      System.out.println(squareList);
	      
	      System.out.println("Point List");
	      System.out.println(pointList);
	      
	      System.out.println("String List");
	      System.out.println(stringList);
	   }//end main

}//end class

