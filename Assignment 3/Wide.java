//   1) Write a program that demonstrates widening conversion from int to double and prints the result.   


import java.util.Scanner;
  
 class Wide{
	 
	  public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
			
	
		System.out.println("Enter no ONLY integer ");
		int no=sc.nextInt();
		
		double d=no;
		
		System.out.println("-----------------------");
			System.out.println(" after widening: "+d);
		
	
	}
 }