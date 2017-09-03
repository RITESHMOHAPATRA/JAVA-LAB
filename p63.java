import java.util.Scanner;

class TwinPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit : ");
		int low = sc.nextInt();
		System.out.println("Enter upper limit : ");
		int up = sc.nextInt();
		for(int i=low;i<=up;i++)
		{
			if(isPrime(i) && isPrime(i+2))
			{
				int next = i+2;
				System.out.println("("+i+","+next+")");
			}
		}
	}

	private static boolean isPrime(int num) 
	{
		if(num==1)
			return false;
		for(int i=2;i<=(int)Math.sqrt(num);i++)
			if(num%i == 0)
				return false;
		return true;
	}
}