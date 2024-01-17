import java.util.Scanner;
class Employee{
   public int id;
   public String name;
   public int age;
}
class Developer extends Employee{
    public double salary = 50000;
    public String designation = "Developer";
    boolean f=true;
    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
    }
    void raiseSal(){
        f=false;
	salary=salary+salary*0.15;
	System.out.println("New Salary : " + salary);
    }
}

class Clerk extends Employee{
    public double salary = 250000;
    String designation = "Clerk";
    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
    }
    void raiseSal(){
	salary=salary+salary*0.05;
	System.out.println("New Salary : " + salary);
    }
}
class Manager extends Employee{
    public double salary = 90000;
    String designation = "Manager";
    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
    }
    void raiseSal(){
	salary=salary+salary*0.20;
	System.out.println("New Salary : " + salary);
    }
}
class Tester extends Employee{
    public double salary = 40000;
    String designation = "Tester";
    void display(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
    }
    void raiseSal(){
	salary=salary+salary*0.1;
	System.out.println("New Salary : " + salary);
    }
}

public class demo {
    public static void main(String args[]){
        Developer d = new Developer();
        Tester t = new Tester();
        Manager m = new Manager();
        Clerk c = new Clerk();

        int ch1 = 0;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("1) Create");
            System.out.println("2) Display");
	    System.out.println("3) Raise Salary");
            System.out.println("4) Exit");

            System.out.println("Enter your choice.....");
            ch1 = sc.nextInt();

            if(ch1 == 1){ //create
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("5) Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    d.name = name;
                    d.id = id;
                    d.age = age;
                }
                if(ch2 == 2){ //Clerk
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    c.name = name;
                    c.id = id;
                    c.age = age;
                }
                if(ch2 == 3){ //Tester
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    t.name = name;
                    t.id = id;
                    t.age = age;
                }
                if(ch2 == 4){ //Manager
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    System.out.println("Name: ");
                    String name = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();

                    m.name = name;
                    m.id = id;
                    m.age = age;
                }
                if(ch2 == 5){ //exit to main menu
                    continue;
                }
            }
            if(ch1 == 2){ //display
                int ch2 = 0;

                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("Exit to main menu");

                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();

                if(ch2 == 1){ //developer
                    if(d.id != 0)
                        d.display();
                    else
                        System.out.println("Developer Not yet registered");
                }
                if(ch2 == 2){ //Clerk
                    if(c.id != 0)
                        c.display();
                    else
                        System.out.println("Clerk Not yet registered");
                }
                if(ch2 == 3){ //Tester
                    if(t.id != 0)
                        t.display();
                    else
                        System.out.println("Tester Not yet registered");
                }
                if(ch2 == 4){ //Manager
                    if(m.id != 0)
                        m.display();
                    else
                        System.out.println("Manager Not yet registered");
                }
                if(ch2 == 5) { //exit to main menu
                    continue;
                }
            }
	    if(ch1==3){
		int ch2 = 0;
                System.out.println("1) Developer");
                System.out.println("2) Clerk");
                System.out.println("3) Tester");
                System.out.println("4) Manager");
                System.out.println("5) Exit to main menu");
                System.out.print("Enter your choice : ");
                ch2 = sc.nextInt();
                if(ch2==1){
			if(d.f==false) System.out.println("Already Raised");
			if(d.f==true) d.raiseSal();
		}
		if(ch2==2){
			c.raiseSal();
		}
		if(ch2==3){
			t.raiseSal();
		}
		if(ch2==4){
			m.raiseSal();
		}
		if(ch2==5){
			continue;
		}
	    }
            if(ch1 == 4) {
                System.exit(0);
            }
        }while(ch1 != 5);
    }
}
