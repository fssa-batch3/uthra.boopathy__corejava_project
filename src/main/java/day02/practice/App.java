package day02.practice;

public class App {

	public static void main(String[] args) {
		
		User user = new User();
		user.setName("Uthra");
		user.setEmail("uthra@gmail.com");
		user.setId(1);
		user.setPassword("Uthra@12");
		
		System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        
		
	}
	
}
