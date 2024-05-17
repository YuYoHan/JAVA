package J2day4;
// 2-3
public class Television2_3 implements Remotecontrol2_1 {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remotecontrol2_1.MAX_VOLUMN) {
			System.out.println("TV 볼륨의 최대치 값은 10입니다.");
			this.volume = Remotecontrol2_1.MAX_VOLUMN;
		} else if(volume < Remotecontrol2_1.MIN_VOLUMN) {
			System.out.println("TV 볼륨의 최소치 값은 10입니다.");
			this.volume = Remotecontrol2_1.MIN_VOLUMN;
		} else {
			this.volume = volume;
		}
		System.out.println("TV 현재 볼륨: " + this.volume);
	}
	
	
}
