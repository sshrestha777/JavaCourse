
public class SingleDimArrayDemo {

	public static void main(String[] args) {
	
		/* int a[] = new int[5];
		   a[0] = 100;
		   a[1] = 200;
		   a[2] = 300;
		   a[3] = 400;
		   a[4] = 500;
		   
		 */		
		int a[] = {100,200,300,400,500}; //Declared array without specifying size- Dynamic array
	
		System.out.println(a.length); //Size of an array
        System.out.println(a[2]); //extract specific value from array
       
 //classic
       for(int i = 0; i < a.length; i++)
       //     for(int i = 0; i <=a.length-1; i++);
       
       {
    	   System.out.println(a[i]);
       }
       
 //for each loop/enhanced for loop
       for(int i:a)
       {
    	   System.out.println(i);
       }
       
       
	}

}
