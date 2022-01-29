package Exception;

import java.util.InputMismatchException;

public class MyException2 {

	public static void main(String[] args) {
		
		System.out.println("Program is Start");
		
	try {
		
		
       int c= 5/0;
		
		System.out.println("The Answer is "+c);
		
	} 
	
	
	catch (ArithmeticException e) {
		
		
		System.out.println("Something wrong Please check: "+e.getMessage());
		
		System.out.println("Please correct this, division not possible by Zero");


	}	
		
		
finally
	
	{
		System.out.println("Finally Program is closed");
	}
		
		
		
	}

}
