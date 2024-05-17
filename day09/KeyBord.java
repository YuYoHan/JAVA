package day09;
// 1-1
public class KeyBord {
	String model;
	private int price;
	
	// 생성자1 - 생성자오버로딩
	public KeyBord(String model, int price) {
		this.model = model;
		this.price = price;
	}
	// 생성자2 - 생성자오버로딩
	public KeyBord(String model) {
		this.model = model;
	}
	// 생성자3 - 생성자오버로딩
	public KeyBord(int price) {
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
