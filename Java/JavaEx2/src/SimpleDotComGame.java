import java.io.*;

public class SimpleDotComGame
{
	public static void main(String[] args)
	{
		int numOfGuesses = 0;
		
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomNum = (int) (Math.random() * 5);
		
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		
		theDotCom.setLocationCells(locations);
		
		boolean isAlive = true;
		
		while(isAlive)
		{
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourself(guess);
			
			numOfGuesses++;
			
			if(result.equals("kill"))
			{
				isAlive = false;
				
				System.out.println(numOfGuesses + " guesses");
			}
		}
	}
}

class GameHelper
{
	public String getUserInput(String prompt)
	{
		String inputLine = null;
		System.out.print(prompt + " ");
		try
		{
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));			
			inputLine = is.readLine();
			
			if(inputLine.length() == 0) return null;
		}
		
		catch(IOException e)
		{
			System.out.println("IOExceiption : " + e);
		}
		
		return inputLine;
	}
}