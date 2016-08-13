public class NoofAlpha
{
	public static void main(String[] args)
	{
		int count=0;
		String a="alphabets in string 123 post your own codekata question!";
		char[]b=a.toCharArray();
		
		for(int i=0;i<b.length;i++)
		{
		if(Character.isAlphabetic(b[i]))
		{
			count=count+1;
		}
		}
		System.out.println(count);
	}
	

}
