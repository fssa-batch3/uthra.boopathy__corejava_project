package day02.solved;

public class UsingThisKeyword {
	
	    private static String name;  // Private data member

	    public String getName() {  // Public getter method
	        return name;
	    }

	    public void setName(String name) {  // Public setter method
	        // name = name; Wrong way to use refer the attribute of class
				this.name = name; // this Keyword used for referring current instance
	    }
	    
	    public static void main(String[] args) {	

	// Usage
UsingThisKeyword person = new UsingThisKeyword();
	person.setName("John");      // Setting the name using the setter method
	String name = person.getName();  // Accessing the name using the getter method
	System.out.println(name);    // Output: John

}

}

