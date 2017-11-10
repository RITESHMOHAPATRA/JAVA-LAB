import java.util.Scanner;
class LargestFactorialInLong
{
	public static void main(String[] args)
	{
		long res = 1;
		int i=1;
		while(res>0)
		{
			res = res*i;
			i++;
		}
		System.out.println(i-1);
		
	}
}