import java.util.Scanner;
class Divisor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no: ");
		int a = sc.nextInt();
		for(int i=2;i<a;i++)
		{
			if((a%i) == 0)
			{
				if(i%2==0)
					System.out.println("Even Divisor : "+i);
				else
					System.out.println("Odd Divisor : "+i);
			}
		}
	}
}