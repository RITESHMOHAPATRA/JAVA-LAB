import java.util.Scanner;
class GCDLCM
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 nos: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter your choice: ");
		System.out.println("1 for GCD: ");
		System.out.println("2 for LCM: ");
		int ch = sc.nextInt();
		switch(ch)
		{
			case 1: n1 = gcd(n1,n2);
					System.out.println("GCD is " + n1);
					break;
			case 2: lcm(n1,n2);
					break;
			default: System.out.println("wrong choice"); 
					break;
		}
	}
	
	static int gcd(int n1,int n2)
	{
		while(n1!=n2)
		{
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
		}
		return n2;
		
	}
	
	static void lcm(int n1,int n2)
	{
		
		System.out.println("LCM is " + (n1*n2)/gcd(n1,n2));
		
	}
	
	
}