import java.util.*;
class demo3{
	public static void main(String args[])
	{
		m1();
	}
	static void m1() 
	{	
		System.out.println("M1 method...");
		try{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter A: ");
			int a=sc.nextInt();
			System.out.println("Enter B: ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("The result is: " +c);
		}
		catch(InputMismatchException im)
		{
			System.out.println("Enter a number only");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Enter a non-zero number only");
		}
		m2();
	} 
	static void m2()
	{
		System.out.println("M2 method...");
		m3();
	}
	static void m3()
	{
		System.out.println("M3 method...");
	}
}