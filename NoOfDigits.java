package beginner;

import java.util.Scanner;

public class NoOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Integer");
		int a=sc.nextInt();
		int t=0;
		int count=0;
		while(a!=0)
		{
		t=a%10;
		count++;
		a=a/10;
		}
		System.out.println(count);
	}
		

}
