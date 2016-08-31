package beginner;

import java.util.Scanner;

public class VowelorConsonant 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char a=sc.next().charAt(0);
		a=Character.toLowerCase(a);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.println("Character is vowel");
		}
		else
		{
			System.out.println("Character is Consonant");
		}
				
		
	}

}
