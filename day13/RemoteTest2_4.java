package J2day4;
// 2-4
public class RemoteTest2_4 {

	public static void main(String[] args) {
		Remotecontrol2_1 c = new Television2_3();
		c.turnOn();
		c.setVolume(15);
		
		c.setVolume(-100);
		c.turnOff();
		
		c = new Audio2_2();
		c.turnOn();
		c.setVolume(15);
		c.setVolume(-50);
		c.turnOff();
		
		c.setVolume(5);
		c.setVolume(7);
	
	}

}
