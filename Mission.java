/**
 * Mission class holds the name, type, operator, year and an array of spacecrafts and astronauts
 * 
 * @author Andrew Neumann (obb447)
 * UTSA CS 3443 - Lab 1
 * Fall 2022
 */

public class Mission 
{
	  String name;
	  String operator;
	  String type;
	  int year;
	  Spacecraft spacecrafts[] = new Spacecraft[2];
	  int numSpacecraft;
	  Astronaut astronauts[] = new Astronaut[3];
	  int numAstronauts;
	  public Mission(String name, String operator, int year, String type) 
	  {
		  this.name = name;
		  this.operator = operator;
		  this.year = year;
		  this.type = type;
	  }
	  // input spacecraft as object
	  // returns nothing
	void addSpacecraft(Spacecraft spacecraft)
	  {
		  this.spacecrafts[numSpacecraft++] = spacecraft;
	  }
	
	  // input astronaut as object
	  // returns nothing
	  void addCrewMember(Astronaut astronaut)
	  {
		  this.astronauts[numAstronauts++] = astronaut;
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
      // returns operator as string
	  public String getOperator() 
	  {
	    return this.operator;
	  }

	  // input operator as string
	  // returns nothing
	  public void setOperator(String newOperator) 
	  {
	    this.operator = newOperator;
	  }
	  // input none
      // returns type as string
	  public String getType() 
	  {
	    return this.type;
	  }

	  // input type as string
	 // returns nothing
	  public void setType(String newType) 
	  {
	    this.type = newType;
	  }
	  // input none
      // returns year as int
	  public int getYear() 
	  {
	    return this.year;
	  }

	 // input year as int
     // returns nothing
	  public void setYear(int newYear) 
	  {
	    this.year = newYear;
	  }
	  
	  //inputs none
	  //Returns Mission data as string
	  public String toString()
	  {
		  String outString = "";
		  outString += String.format("%s (%s)\n",this.name, this.operator);
		  outString += String.format("  %s, %d\n",this.type, this.year);
		  outString += String.format("  Spacecrafts:\n");
		  outString += String.format("    %s\n", this.spacecrafts[0]);
		  outString += String.format("    %s\n", this.spacecrafts[1]);
		  outString += String.format("  Crew:\n");
		  outString += String.format("    %s\n", this.astronauts[0]);
		  outString += String.format("    %s\n", this.astronauts[1]);
		  outString += String.format("    %s\n", this.astronauts[2]);
		  return outString;
	  }
	        
	        
}
