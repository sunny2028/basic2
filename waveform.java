package one;

import java.util.Scanner;
public class waveform {

	public static void fun()
	{
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			
		}

		
		for(int i=0;i<10;)
		{
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		i=i+2;
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
	public static void main(String args[])
	{
		fun();
	}
}
