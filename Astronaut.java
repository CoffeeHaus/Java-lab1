/**
 * Astronaut class holds the name and position of the Astronaut
 * 
 * @author Andrew Neumann (obb447)
 * UTSA CS 3443 - Lab 1
 * Fall 2022
 */

public class Astronaut {

	  String name;
	  String position;
	  
	  //input string of name and string of position
	  //returns Astronaut object
	  public Astronaut(String strName, String strPosition)
	  {
		this.position = strPosition; 
		this.name = strName;
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
	  // returns position as string
	  public String getPosition() 
	  {
	    return this.position;
	  }

	  // input position as string
	  // returns nothing
	  public void setPosition(String newPosition) {
	    this.position = newPosition;
	  }
	  //inputs none
	  //Returns Astronaut data as string
	  public String toString()
	  {
		  return this.position + " : " + this.name;
	  }
	  
}
