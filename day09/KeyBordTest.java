package day09;

public class KeyBordTest {

	public static void main(String[] args) {
		KeyBord k5 = new KeyBord("B200",7000);
		System.out.println(k5.getPrice());
		System.out.printf("%s, %d\n", k5.getModel(), k5.getPrice());
	
		KeyBord k6 = new KeyBord("", 0);
		k6.setModel("B300");
		k6.setPrice(100000);
		System.out.println(k6.getModel());
		System.out.println(k6.getPrice());
	}

}
