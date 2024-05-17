package J2day4;
// 2-1
public interface Remotecontrol2_1 {
	// 상수(static final)
	static final int MAX_VOLUMN = 10;
	static final int MIN_VOLUMN = 0;
	
	// 추상 메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}
