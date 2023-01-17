//write a java program to swap two numbers with and without using third variable

public class Swapnumbers 
{

	public static void main(String[] args) 
	
	{
		
		float first = 1.10f, second = 2.10f;
		
		System.out.println("--Beforeswap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
		
		//using temporary variable
		float temporary = first;
		first = second;
		second = temporary;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
		//without using third variable
		
		first = first -second;
		second = first + second;
		first = second - first;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
		
	}
	
	

}
