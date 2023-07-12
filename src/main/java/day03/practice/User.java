package day03.practice;

public class User {
	
	String name;
	String email;
	String password;
	
	public User(String email, String name) {
		this.email = email;
		this.name = name;
	}
	
	public User(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		
		User user = new User("uthra@gmail.com", "Uthra");
		
		User user1 = new User("Uthra", "Uthra@12", "uthra@gmail.com");
		
		System.out.println("Email :" + user.getEmail() + " Name :" + user.getName());
		
		System.out.println("Name: " + user1.getName() + " Password: " + user1.getPassword() + "Email: " + user1.getEmail());
		
	}

}
