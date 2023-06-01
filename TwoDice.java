// Chapter 5 Random number generator method Exercise

public class TwoDice
{
	public static void main(String[] args) 
	{
		//Variables and constants
		String outcome;
		Die die1 = new Die();
		Die die2 = new Die();

		// Processing phase
		if(die1.getDieValue() > die2.getDieValue())
		{
			outcome = "The Player wins the game!";
		}	
		else
		{
			if(die1.getDieValue() < die2.getDieValue())
			{
				outcome = "CPU has won the game";
			} // End of Nested If statement

			else
			{ // This is the result of a tie. We do not need the: if(die1.getDieValue() == die2.getDieValue()) command because the program knows that we didnt win or lose. 
				outcome = "We have tied the game";
			} //End of Nested ELSE statement	
		} // End of first ELSE statement

		// Output phase
		System.out.println("The Players die roll was a: " + die1.getDieValue());
		System.out.println("The CPU die roll was a: " + die2.getDieValue());
		System.out.println(outcome);
	}
}