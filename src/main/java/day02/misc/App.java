package day02.misc;

public class App {
	
	public static void main(String[] args) {
		
		Academy academy = new Academy();
		academy.setName("Freshworks");
		academy.setId(1);
		academy.setCode("FSSA");
		
		Student student1 = new Student();
		student1.setName("Uthra");
		student1.setId(001);
		student1.setEmail("uthra@gmail.com");
		
		System.out.println(Student.staticIntCount);
		
		Student student2 = new Student();
		student2.setName("Uthra");
		student2.setId(001);
		student2.setEmail("uthra@gmail.com");
		
		System.out.println(Student.staticIntCount);
		
	}

}
