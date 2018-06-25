package one;
import java.util.*;

public class rectabgle {
public static double length,breadth;
public static void CalculatArea()
{
	Scanner sc=new Scanner(System.in);
	length=sc.nextDouble();
	breadth=sc.nextDouble();
	System.out.println(length*breadth);
	
}
public static void main(String args[])
{
	CalculatArea();
}
}
