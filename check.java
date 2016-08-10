import java.util.Scanner;

public class Logic
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number1");
		int a=sc.nextInt();
		System.out.println("Enter Number2");
		int b=sc.nextInt();
		System.out.println("Enter Number3");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c && b>a)
		{
			System.out.println("b is greater");
		}
		else
			System.out.println("c is greater");
	
	}
}
