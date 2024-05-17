 package j2day5;

 class User {
	 int id;
	 String name;
	 
	 public User(int id, String name) {
		 this.id = id;
		 this.name = name;
	 }
	 public int getId() {
		 return id;
	 }
	
	 @Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			return this.getId() == ((User)obj).getId();
		} else {
			return false;
		}
	}
	 
	 
 }

public class Equals {

	public static void main(String[] args) {
		User user1 = new User(1001, "홍길동");
		User user2 = new User(1001, "홍길동");
		
		System.out.println(user1.equals(user2));
	}

}
