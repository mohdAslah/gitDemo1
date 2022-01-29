package Exception;

import java.util.InputMismatchException;

public class MyException {

	public static void main(String[] args) {
		
		System.out.println("Program is Start");
		
	try {
		
       int c= 5/0;
		
		System.out.println("The Answer is "+c);
		
		
		
	} 
	
	
	
	catch (Exception e) {
		
		
		System.out.println("Something wrong Please check: "+e.getMessage());
		
		System.out.println("Please correct this, division not possible by Zero");

		System.out.println(" 2 Please correct this, division not possible by Zero");
		System.out.println(" 3 Please correct this, division not possible by Zero");

		System.out.println(" 4 Please correct this, division not possible by Zero");



	}	
		
	
		
	
	
		
	}

}
