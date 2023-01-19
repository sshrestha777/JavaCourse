
public class TwiDimArrayDemo {

	public static void main(String[] args) {
	
		/*int a [][] = new int [3][2];

		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 300;
		a[1][1] = 400;
		
		a[2][1] = 500;
		a[2][2] =600;
		*/
		
		int a[][] = {{100,200}, 
				    {300,400},
				    {500,600}}; //dynamic array
		
		System.out.println("Humber of rows:" + a.length);
		System.out.println("Humber of columns:" + a[0].length);
		
		for(int i =0; i<a.length; i++) // i represents row index
			
		{
			//System.out.println(a[i].length);
			for (int j =0; j< a[i].length; j++) // j represents columns
				
			{
				System.out.println(a[i][j]);
			}
			
		}
		
		
		
	}

}
