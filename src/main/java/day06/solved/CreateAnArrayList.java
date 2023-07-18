package day06.solved;

import java.util.ArrayList;

public class CreateAnArrayList {
	
	
	// How its stored in an normal array
//    String[] cityArr = new String[3];
//    cityArr[0] ="Chennai";
//    cityArr[1] = "Bangalore";
//    cityArr[2] = "Mumbai";
    
    
    //// HOW TO STORE IN ARRAY LIST
 
    //without using generics
    public static void main(String[] args) {
     
        // Store the city names in the List
//        ArrayList cityList  = new ArrayList();
//        cityList.add("Chennai");
//        cityList.add("Bangalore");
//        cityList.add("Mumbai");
//         
//        // Display the city names
//        for (Object object : cityList) {
//            String cityName = (String) object; // TypeCast object to String
//            System.out.println(cityName);           
//        }
// 

    
    
    
	    // Store the city names in the List ( use Generics )
	    ArrayList<String> cityList  = new ArrayList<String>();
	    cityList.add("Chennai");
	    cityList.add("Bangalore");
	    cityList.add("Mumbai");
	     
	    // Display the city names
	    for (String cityName : cityList) {           
	        System.out.println(cityName);           
	    }

 
    }
    
}