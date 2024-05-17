package j2day3;

class Car {
	private String name; // 차이름
	
	Car() {
		this.name = "";
	}

	Car(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getSpeed() {
		return 100;
	}
}

class SuperCar extends Car {
	SuperCar() {
		super();
	}

	SuperCar(String name) {	
		super(name);
	}
	
	@Override
	public int getSpeed() {
		return super.getSpeed() + 100;
	}
	
}

public class OverrideExam {
	public static void main(String[] args) {
		Car car = new Car("모닝");
		System.out.println(car.getSpeed());

		SuperCar supercar = new SuperCar("포르쉐");
		System.out.println(supercar.getSpeed());
	}
}

}
