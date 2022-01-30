package Exception;

import java.util.InputMismatchException;

public class MyException3 {

	public static void main(String[] args) {
		
		System.out.println("Program is Start");
		
	try {
		
		
      int a[]= new int[3];
		
		System.out.println(a[7]);
		
	} 
	
	catch(IndexOutOfBoundsException e)
	
	{
		System.out.println("Index outofBound, Something wrong Please check: ");

		
	}
	catch (ArithmeticException e) {
		
		
		System.out.println("Something wrong Please check: "+e.getMessage());
		
		System.out.println("Please correct this, division not possible by Zero");


	}	
		
		
finally
	
	{
		System.out.println("Finally Program is closed");
		System.out.println(" branch Please correct this, division not possible by Zero");

		System.out.println(" branch Please correct this, division not possible by Zero");

	}
		
		
		
	}

}
