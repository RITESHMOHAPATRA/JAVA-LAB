import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		for(int j=1;j<=50;j++)
		{
			int i;
			long f=1;
			for(i=1;i<=j;i++)
			{
				f=f*i;
			}
			System.out.println("factorial of  " + j +" is " +f);
			System.out.println("multiplication table of "+j);
			for(i=1;i<=10;i++)
			{
				System.out.println(j+"*"+i+"="+(j*i));
			}
		}
		
	}
}