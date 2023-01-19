
public class PositiveAndNegativeNumbersInArray {

	public static void main(String[] args) {
	
		int a[] = {10,-10,20,-20,30,-30};
		
		System.out.println("Postive numbers are...");
		
		for (int num: a)
		{
			
			if (num >= 0)
				
			{
				
            System.out.println(num);
	
                
			}
		}
		
		System.out.println("Negative numbers are...");
		
		for (int num :a)
			
		{
			if (num < 0)
				
			{
				System.out.println(num);
			}
		}
		

	}

}
