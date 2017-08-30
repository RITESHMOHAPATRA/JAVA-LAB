import java.util.Scanner;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 nos");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("a= "+a+" is largest");
		}
		else
		if(b>=c)
			System.out.println("b= "+b+" is largest");
		else
			System.out.println("c = "+c+" is largest");
		
	}
}