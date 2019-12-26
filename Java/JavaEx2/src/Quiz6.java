public class Quiz6	//-> Triangle
{
	double area;
	int height;
	int length;
	public static void main(String args[])
	{
		Quiz6[] ta = new Quiz6[4];
		int x = 0;
		while(x < 4)
		{
			ta[x] = new Quiz6();
			ta[x].height = (x + 1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			
			System.out.print("triagnle " + x + ", area");
			System.out.println(" = " + ta[x].area);
			
			x = x + 1;
		}
		
		int y = x;
		x = 27;
		Quiz6 t5 = ta[2];
		ta[2].area = 343;
		System.out.print("y = " + y);
		System.out.println(", t5 area = " + t5.area);
	}

	void setArea()
	{
		area = (height * length) / 2;
	}
}