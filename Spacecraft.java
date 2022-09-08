/**
 * Spacecraft class holds the name, type, and number of the Spacecraft
 * 
 * @author Andrew Neumann (obb447)
 * UTSA CS 3443 - Lab 1
 * Fall 2022
 */

public class Spacecraft {
	String type;
	String name;
	int number;
	
	 public Spacecraft(String name, String type, int number)
	 {
		 this.name = name;
		 this.type = type;
		 this.number = number;
	 }
	 
	  // input none
      // returns name as string
	  public String getName() 
	  {
	    return this.name;
	  }

	  // input name as string
	  // returns nothing
	  public void setName(String newName) 
	  {
	    this.name = newName;
	  }
	  
	  // input none
	  // returns type as string
	  public String getType() 
	  {
	    return this.name;
	  }

	  // input type as string
	  // returns nothing
	  public void setType(String newType) 
	  {
	    this.type = newType;
	  }
	  
	  // input none
	  // returns number as int
	  public int getNumber() 
	  {
	    return this.number;
	  }

	  // input number as int
	  // returns nothing
	  public void setNumber(int newNumber) 
	  {
	    this.number = newNumber;
	  }
	  
	  //inputs none
	  //Returns Spacecraft data as string
	  public String toString()
	  {
		  return this.type + "(" + this.number + ") : "+ this.name;
	  }
}
