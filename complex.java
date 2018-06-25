package one;

import java.util.Scanner;

public class complex {
	public static int real,imaginary;
	public static void display()
	{
		Scanner sc=new Scanner(System.in);
	real=sc.nextInt();
		imaginary=sc.nextInt();
		System.out.println(real+"+"+imaginary+"i");
		
	}
	public static void main(String args[])
	{
		display();	
		}
	
}
