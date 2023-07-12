package day03.misc;

import java.time.LocalDateTime;

public class Logger {
	
	public static void info(String msg) {
		
		System.out.print(msg);
		
	}
	
	public static void debug(String msg) {
		
		LocalDateTime currentDate = LocalDateTime.now();
		
		System.out.print("TimeStamp:".concat(currentDate.toString().concat(" ")).concat(msg));
		
	}

}
