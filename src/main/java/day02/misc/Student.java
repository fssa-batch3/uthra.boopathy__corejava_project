package day02.misc;

public class Student {

	String name;
	String email;
	int id;
	public static String academy;
	static int staticIntCount = 0;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Student() {
		
			Student.staticIntCount++;
		
	}

	static {
		
		academy = "FSSA";
		
	}
	
}
