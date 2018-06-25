package one;
import java.util.*;
public class secondlargest {
	public static int largest=0,secondlargest=0;;
public static void fun()
{
	int arr[]=new int[10];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
		arr[i]=sc.nextInt();
		
	}

	
	for(int i=0;i<10;i++)
	{if(arr[i]>largest)
	{
		secondlargest=largest;
		largest=arr[i];
	}
	else if(arr[i]>secondlargest)
	{
		secondlargest=arr[i];
	}
		
	}
	System.out.println(secondlargest);
}
public static void main(String args[])
{
	fun();
}
}
