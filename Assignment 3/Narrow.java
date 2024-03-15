// 2) Create a program that demonstrates narrowing conversion from double to int and prints the result.   



import java.util.Scanner;
  
 class Narrow{
	 
	  public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
			
	
		System.out.println("Enter no ONLY double value ");
		double no=sc.nextDouble();
		
		int d=(int)no;
		
		System.out.println("-----------------------");
			System.out.println(" after widening: "+d);
		
	
	}
 }