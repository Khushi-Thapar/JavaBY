import java.util.*;
import java.io.*;
class demo{
	public static void main(String args[]) throws FileNotFoundException
	{
		m1();
	}
	static void m1() throws FileNotFoundException
	{	
		System.out.println("M1 method...");
		FileReader fr=new FileReader(f);
		m2();
	} 
	static void m2() throws FileNotFoundException
	{
		System.out.println("M2 method...");
		m3();
	}
	static void m3() throws FileNotFoundException
	{
		System.out.println("M3 method...");
	}
}