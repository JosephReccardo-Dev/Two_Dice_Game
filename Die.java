// Chapter 5 Die (the thing you roll) Exercise

public class Die 
{
	//Instance variables for the Class
	private final int HIGHEST_DIE_VALUE = 10;
	private final int LOWEST_DIE_VALUE = 1;
	private int dieValue;

	// Custom Consrtuctor for the Die class
	public Die()
	{
		dieValue = (int) (Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);

	} // end of the constructor method
	
	// Accessor (getter) method for this class
	public int getDieValue()
	{
		return dieValue;
	} // end of getDieValue()
}