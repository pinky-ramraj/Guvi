# Guvi
import java.util.Scanner;

public class Logic
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int c=sc.nextInt();
		if(c>0)
		{
			System.out.println("Positive Number");
		}
		else if(c<0)
		{
			System.out.println("Negative number");
		}
		else if(c==0)
		{
			System.out.println("Zero");
		}
			
	}

}
