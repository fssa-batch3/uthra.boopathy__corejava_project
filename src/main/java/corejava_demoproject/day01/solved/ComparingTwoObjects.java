package corejava_demoproject.day01.solved;

class Movie {
	public String title;
	
}

public class ComparingTwoObjects {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		movie1.title = "Harry Potter";
		
		Movie movie2 = new Movie();
		
		movie2.title = "Lord of the Rings";
		
		// Each object will be Stored in a separate memory location
		// so it will print false
		System.out.println(movie1 == movie2);
		
		
		
	}
}