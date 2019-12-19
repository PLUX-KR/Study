public class Quiz4	//-> Echo
{
	int count = 0;
	
	void hello()
	{
		System.out.println("helloooo... ");
	}
}

class EchoTestDrive
{
	public static void main(String[] args)
	{
		Quiz4 e1 = new Quiz4();
		Quiz4 e2 = new Quiz4();
		
		int x = 0;
		while(x < 4)
		{
			e1.hello();
			e1.count = e1.count + 1;
			
			if(x == 4)
				e2.count = e2.count + 1;			
			if(x < 4)
				e2.count = e2.count + e1.count;
			
			x = x + 1;
		}
		System.out.println(e2.count);
	}
}