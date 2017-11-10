import java.util.Scanner;
class HandleWithoutCatch
{
	public static void main(String args[])throws ArithmeticException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enetr2 nos ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c;
		try
		{
			c = a/b;
			System.out.println("inside  try block");
		}
		finally{
			System.out.println("bye");
		}
		System.out.println("yo");
		
	}
}