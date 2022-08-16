/**
* author: Abdifatah Abdi
* This class takes an argument of type T.
* This class contains a toString() method that iterates through 
* all of the elements in the internal array and calls each element's 
* toString() method.
*/

package ArrayList;

public class ArrayList<T> {
	
	private int DEFAULT_SIZE;//variable to keep track of the number of elements in the list
	private int CurrentItem;//variable to keep track of the number of elements in the list
	private T arList[];//variable to keep track of the number of elements in the list
	
	
	/**
	 * The constructor for this object initializes the list arList 
	 * 
	 */
	public ArrayList(){
		
		arList = (T[]) (new Object [DEFAULT_SIZE]);
	      CurrentItem = 0;
		
	}//end empty-argument constructor 
	
	
	public ArrayList (int size) {
		arList = (T[]) (new Object [size]);
	      CurrentItem = 0;
	   }//end preferred constructor 
	   
	
	/**
	 * This method adds a new item to the list. 
	 * @param <T>
	 * 
	 */
	   public boolean addItem(T item){
	      if (CurrentItem < arList.length){
	         arList[CurrentItem] = item;
	         CurrentItem++;
	         return true;
	      }
	      else {
	         return false;
	      }
	   }//end boolean addItem
	   
	   /**
		 * Adds toString() method that iterates through all of the elements
		 *  in the internal array and calls each element's toString() method.
		 * @param <T>
		 * 
		 */
	   
	   public String toString() {
	      StringBuilder sb = new StringBuilder();
	      for(int i = 0; i < CurrentItem; i++) {
	         sb.append(arList[i].toString() + "\n");
	      }
	      return sb.toString();
	   }//end toString
	

}//end class
