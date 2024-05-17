package day09;

class Animal {
	String name;
	
	// setter 메소드 아님
	public void setName(String name) {
		this.name = name;
	}
}
public class Class {

	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("boby");
		
		Animal dog = new Animal();
		dog.setName("happy");
		System.out.println(cat.name);
		System.out.println(dog.name);
	}

}
