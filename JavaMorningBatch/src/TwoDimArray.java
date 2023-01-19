
public class TwoDimArray {

	public static void main(String[] args) {
		
		int a[][] = {{100,200}, {300,400},{500,600}};
		
		System.out.println("number of rows:" + a.length);
		System.out.println("number of columns:" + a[0].length);
		
		/*for(int i =0; i< a.length; i++)
			
		{
			for (int j=0; j<a[i].length; j++)
					
					{
						System.out.print(a[i][j] + " ");
					}
					
				System.out.println();	
		}
		
		*/
		
//Enhanced for loop
		
		for (int r[]:a)
		{
			for(int i:r)
			{
				System.out.print(i +" ");
			}
			
			
			System.out.println();
		}
	
	}

}
