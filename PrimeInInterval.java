package beginner;

import java.util.Scanner;

public class PrimeInInterval 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting and Ending Limit");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		int i;
		for(i=a;i<=b;i++)
		{
			if(i%2!=0&&i%3!=0)
			{
					System.out.println(i);
				}
		}
		
	}

}
