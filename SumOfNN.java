package beginner;

import java.util.Scanner;

public class SumOfNN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int a=sc.nextInt();
		int b=0;
		for(int i=0;i<=a;i++)
		{
			b=b+i;
		}
		System.out.println(b);
		
	}

}
