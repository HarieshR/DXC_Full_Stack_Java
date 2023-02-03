package assignment_week_1;
import java.util.Scanner;

class Func {
	int channel = 1; 
	int volumeLevel = 1; 
	boolean on = false; 
	
	public Func() {
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on)
			channel = newChannel;
	}

	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}

	public void channelUp() {
		if (on && channel < 120)
			channel++;
	}

	public void channelDown() {
		if (on && channel > 1)
			channel--;
	}

	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;
	}

	public void volumeDown() {
		if (on && volumeLevel > 1)
			volumeLevel--;
	}
	
	void disp()
	{
		System.out.println("Channel is " + channel+ " ,the volume is " + volumeLevel);
	}
}

	public class TV {
		public static void main(String[] args) {
			
			Func tv = new Func();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("press '1' to turn TV on and press '0' to turn TV off");
			int io = sc.nextInt();

			if(io==1)
				tv.turnOn();
			else if(io==0)
				tv.turnOff();
			else
				System.out.println("Invalid input for TV I/O");
				
			
			System.out.println("press 'CH+' for next channel and 'CH-' for previous channel");
			String ch = sc.next();
			
			if(ch=="CH+"||ch=="ch+")
				tv.channelUp();
			
			else if(ch=="CH-"||ch=="ch-")
				tv.channelDown();
			
		
			System.out.println("press num bet 1 - 120 to change the channel");
			int n = sc.nextInt();
				
			if (n>=1 && n<=120)
				tv.setChannel(n);
			else
				System.out.println("Invalid input");
			
			System.out.println("press num btw 1 - 7 to adjust the volume");
			int v = sc.nextInt();
			
			if (v>=1 && v<=7)
				tv.setVolume(v);
			else
				System.out.println("Invalid input");
			tv.disp();
			}
	}