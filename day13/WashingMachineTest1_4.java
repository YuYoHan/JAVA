package J2day4;
// 1-4
public class WashingMachineTest1_4 {

	public static void main(String[] args) {
		LGWashingMachine1_3 ws = new LGWashingMachine1_3();
		
		ws.startButtonPressed();
		System.out.println("세탁기의 속도는 " + ws.changeSpeed(3));
		
		

	}

}
