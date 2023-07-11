package day01.solved;

public class StaticVsInstanceVariable {
   
	// Declare a static variable
    public static int staticVariable;
    
    // Declare an instance variable
    public int instanceVariable;

    public static void main(String[] args) {
       
    	/////For Static Variable
    	
    	// Access the static variable using the class name
    	StaticVsInstanceVariable.staticVariable = 10;
        System.out.println("Static Variable: " + StaticVsInstanceVariable.staticVariable);
        
        /////  For Instance variable
        
     // Create an object of MyClass
        StaticVsInstanceVariable myObject = new StaticVsInstanceVariable();

        // Access the instance variable using the object reference
        myObject.instanceVariable = 5;
        System.out.println("Instance Variable: "+ myObject.instanceVariable);
        
    }
}
