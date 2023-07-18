package day05.practice;

public class App {

	public static void main(String[] args) {
		
		try {
		Account myAccount1 = new Account();
		myAccount1.setBalance(5500.00d);
		AxisATM myAxisAccount = new AxisATM();
		myAxisAccount.withdraw(myAccount1, 70.00d);
		System.out.println("AXIS : "+myAccount1.getBalance());
		
		Account myAccount2 = new Account();
		myAccount2.setBalance(10500.00d);
		IciciATM myIciciAccount = new IciciATM();
		myIciciAccount.withdraw(myAccount2, 70.00d);
		System.out.println("ICICI : "+myAccount2.getBalance());
		
		}catch(Exception e) {
		
			System.out.println(e.getMessage());
		
		}
			
		
	}
	
}
