package beginner;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=a;
		int f=b;
		int d=0;
		int t=0;
		int c=0;
		int count=0;
		while(a!=0)
		{
			t=a%10;
			count++;
		    a=a/10;
		}
		while(b!=0)
		{
			t=b%10;
			c=(int) Math.pow(t,count);
			d+=c;
			b=b/10;
		}	
		if(d==f)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}
		
	
		
	}

}
