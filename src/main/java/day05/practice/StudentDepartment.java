package day05.practice;

public class StudentDepartment {

	public static void main(String[] args) {
		
		Department dept = new Department("Maths", 001);
		
		Student std = new Student("Uthra", 101, dept);
		System.out.print(std.toString());
		
//		std.printStudentDetails();
		
	}
	
}
