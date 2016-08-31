package beginner;

import java.util.Scanner;

public class AlphabetorNot 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		char a=sc.next().charAt(0);
		if(Character.isAlphabetic(a))
		{
			System.out.println("Character is alphabet");
		}
		else
		{
			System.out.println("Character is digit");
		}
		
	}

}
