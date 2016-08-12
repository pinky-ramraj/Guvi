public class Power
{
	public static void main(String[] args) {
    double ans = 1;
    int exponent=-1;
    int base=6;
    if (exponent != 0)
    {
        int absExponent = exponent > 0 ? exponent : (-1) * exponent;
        //System.out.println(absExponent);
        for (int i = 1; i <= absExponent; i++) 
        {
            ans *= base;
        }
    System.out.println(ans);
	}
	


}
}
