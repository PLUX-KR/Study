public class Quiz3	//-> DrumKit
{
	boolean topHat = true;
	boolean snare = true;
	
	void playSnare()
	{
		System.out.println("bang bang ba-bang");
	}
	
	void playTopHat()
	{
		System.out.println("ding ding da-dang");
	}
}

class DrumKitTestDrive
{
	public static void main(String[] args)
	{
		Quiz3 d = new Quiz3();
		
		d.playSnare();
		d.playTopHat();
		d.snare = false;
		
		if(d.snare == true)
			d.playSnare();
	}
}