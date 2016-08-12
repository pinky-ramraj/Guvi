public class SumofSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		int t=0;
		int d=a;
		while(a>0)
		{
			while(d>0)
			{
			t=t+d%10;
			d=d/10;
			}
			a=a/10;
			d=a;
			
		}
		
		System.out.println(t);

	}

}
