package beginner;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		int b;
		int c=1;
		for(int i=1;i<=a;i++)
		{
			b=i;
			c*=b;	
		}
		System.out.println(c);
		
	}

}
