import java.util.Scanner;

public class Logic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int a=sc.nextInt();
		if(a%4==0)
		{
			System.out.println("year is non-leap year");
		}
		else
		{
			System.out.println("year is leapyear");
		}
	}
}
