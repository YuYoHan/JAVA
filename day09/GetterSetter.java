package day09;

class stat {
	private int power;
	private int dex;
	private int intel;
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		if(power < 0) {
			this.power = 0;
		} else {
			this.power = power;
		}
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		if(dex < 0) {
			this.dex =0;
		} else {
			this.dex = dex;
		}
	}
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		if(intel < 0) {
			this.intel = 0;
		} else {
			this.intel = intel;
		}
	}
}

public class GetterSetter {
	
	public static void main(String[] args) {
		stat character = new stat();
		
		character.setPower(999);
		character.setDex(999);
		character.setIntel(999);
		
		System.out.println("나의 힘능력치는 : " + character.getPower());
		System.out.println("나의 민첩능력치는 : " + character.getDex());
		System.out.println("나의 지능능력치는 : " + character.getIntel());
	}

}
