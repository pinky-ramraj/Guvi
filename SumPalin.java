import java.util.Scanner;

public class ArrayLogic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int c=sc.nextInt();
		int a=0;
		int sum=0;
		while(c!=0)
		{
			a=c%10;
			sum=sum+a;
			c=c/10;
		}
		System.out.println(sum);
		int r=0;
		int out=0;
		int t=sum;
		while(sum!=0)
		{
			r=sum%10;
			sum=sum/10;
			out=out*10+r;
		}
		if(t==out)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
	}
}


