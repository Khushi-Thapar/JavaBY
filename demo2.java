import java.util.Scanner;
class Emp
{
	int id;
	int age;
	String name;
	 int sal=20000;
	String desig; 
	Emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id: ");
		id=sc.nextInt();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		System.out.println("Enter name: ");
		name=sc.next();
	}
}
class Developer extends Emp
{
	Developer()
	{
		//sal= 50000;
		desig="Developer";
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
		System.out.println("Designation: "+desig);
	}
}
class Clerk extends Emp
{
	Clerk()
	{
		sal= 20000;
		desig="Clerk";
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
		System.out.println("Designation: "+desig);
	}
}
class Manager extends Emp
{
	Manager()
	{
		sal= 90000;
		desig="Manager";
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
		System.out.println("Designation: "+desig);
	}
}
class Tester extends Emp
{
	Tester()
	{
		sal= 40000;
		desig="Tester";
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+sal);
		System.out.println("Designation: "+desig);
	}
}
public class demo2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Developer");
		System.out.println("Press 2 for Clerk");
		System.out.println("Press 3 for Manager");
		System.out.println("Press 4 for Tester");
		System.out.println("Press 5 to exit");
		int ch;
		ch= sc.nextInt();
		if(ch==1)
		{
			Developer d= new Developer();
			d.display();
		}
		if(ch==2)
		{
			Clerk c= new Clerk();
			c.display();
		}
		if(ch==3)
		{
			Manager m= new Manager();
			m.display();
		}
		if(ch==4)
		{
			Tester t= new Tester();
			t.display();
		}
		if(ch==5)
		{
			System.out.println("Thanks!!!");
		}
	}
}