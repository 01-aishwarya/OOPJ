//4) Write a Program that demonstrates widening conversion from int to (double,float, boolean, string)  and prints the result.


import java.util.Scanner;
  
 class WCon{
	 
	  public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
			
	
		System.out.println("Enter no ONLY integer ");
		int no=sc.nextInt();
		
		double d=no;
		float f=no;
		boolean b=(no!=0);
		
		String s=String.valueOf(no);
		
		
		System.out.println("-----------------------");
			System.out.println(" int - boolean: "+b);
			System.out.println(" int - float: "+f);
				System.out.println(" int - double: "+d);
					System.out.println(" int - string: "+s);
	
	}
 }