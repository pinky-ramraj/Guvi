import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Logic
{

	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter String");
	    	String s=sc.next();
	    	char[] a=s.toCharArray();
	        
	    	
	    	Set<Character> set=new LinkedHashSet<Character>();
	    	for(char c:a)
	    	{
	    	    set.add(Character.valueOf(c));
	    	}
	    	System.out.println(set);
	    }
	}

