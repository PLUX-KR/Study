public class Quiz1	//Shuffle1
{
	public static void main(String[] args)
	{
		int x = 3;
		
		while(x > 0)
		{
			if(x > 2)
				System.out.print("a");
			else if(x == 2)
				System.out.print("b c");

			x -= 1;
			System.out.print("-");
			
			if(x == 1)
			{
				System.out.print("d");
				
				x -= 1;
			}
		}
	}
}