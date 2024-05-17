package J2day4;
// 1-3 인터페이스 1,2 을 사용 (인터페이스 다중상속)
public class LGWashingMachine1_3 implements WashingMachine1_1, DryCouse1_2 {

	@Override
	public void startButtonPressed() {
		System.out.println("세탁기가 빨래를 시작하였습니다.");
	}

	@Override
	public void pauseButtonPressed() {
		System.out.println("세탁기가 빨래를 중지하였습니다.");
	}

	@Override
	public void stopButtonPressed() {
		System.out.println("세탁기가 빨래를 일시 중지하였습니다.");
	}

	@Override
	public int changeSpeed(int speed) {
		int rtnSpeed = 0;
		switch (speed) {
		case 1:
			rtnSpeed = 20;
			break;
		case 2:
			rtnSpeed = 50;
			break;
		case 3:
			rtnSpeed = 100;
			break;

		}
		return rtnSpeed;
	}

	@Override
	public void dry() {
		System.out.println("세탁기 완료되어 건조하기 시작하였습니다.");
	}
	
	

	
	
}

