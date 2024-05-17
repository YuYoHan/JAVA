package j2day3;

class Animal {
	public void print() {
		System.out.println("나는 동물입니다.");
	}
}

class Monkey extends Animal {

	@Override
	public void print() {
//		super.print();		// 부모 클래스꺼를 가져와서 Animal print와 monkey print와 같이 출력
		System.out.println("나는 원숭이 입니다.");
	}
	
}
class Dog extends Animal {
	@Override
	public void print() {
		System.out.println("나는 개 입니다.");
//		super.print();
	}
	public void sound() {
		System.out.println("개는 멍멍!!!");
	}
}
class Cat extends Animal {
	@Override
	public void print() {
		System.out.println("나는 고양이 입니다.");
//		super.print();
	}
	public void sound() {
		System.out.println("고양이는 야오오오오~옹!!!");
	}
}

public class CastingExam {

	public static void main(String[] args) {
		Monkey monkey = new Monkey();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
//		monkey.print();
//		dog.print();
//		cat.print();
		
		print(monkey);
		
//		Animal a1 = (Animal)monkey;		// Upcasting(명시적 업캐스팅) → 자기 자신께 있다면 자기것을 출력
//		Animal a2 = dog;				// 자동 형변환
//		Animal a3 = cat;
		
//		a1.print();
//		a2.print();
//		a3.print();
		
		// 업케스팅 예제
//		print((Animal)monkey);			// Upcasting
//		print(dog);
//		print(cat);
		
		// 다운캐스팅 예제
		cprint(dog);
		cprint(monkey);
		cprint(cat);
	}
	// 업캐스팅
	public static void print(Animal p) {
		System.out.println("==========");
		System.out.println("안녕하세요");
		p.print();
	}
	// 다운캐스팅
	public static void cprint(Animal p) {
		System.out.println("=============");
		System.out.println("안녕하세요");
		System.out.println("반갑습니다.");
		
		p.print();
		
		
		// 개의 목소리도 출력하고 싶지만, 고양이의 목소리도 출력하고 싶어요.
		if(p instanceof Dog) {
			Dog dog = (Dog) p;
			dog.sound();
		} else if(p instanceof Cat) {
			((Cat)p).sound();
		}
		
		
		System.out.println("============");
	}
}
