package beginner;

import java.util.Scanner;

public class EvenInInterval 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting and Ending Limit");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int count=0;
		for(int i=p;i<=q;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
		
	}


