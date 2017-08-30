import java.util.Scanner;
class Check
{
	static void checkPrime(int n)
	{
		int i,f=1;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("no is not prime");
				f=0;
				break;
			}

		}
		if(f==1)
			System.out.println("no is prime");
	}
	static void checkPalindrome(int n)
	{
		int t,d=0;
		t=n;
		while(t!=0)
		{
			d = d*10 + t%10;
			t=t/10;
				
		}
		if(d==n)
			System.out.println("no is palindrome");
		else
			System.out.println("no is not palindrome");
	}
	
	static void checkArmstrong(int n)
	{
		int t,d=0,r;
		t=n;
		while(t!=0)
		{
			r = t%10;
			d = d + r*r*r;
			t=t/10;
				
		}
		if(d==n)
			System.out.println("no is armstrong");
		else
			System.out.println("no is not armstrong");
	}
	
	static void checkPerfect(int n)
	{
		int i,c=1;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c=c+i;
			}

		}
		if(c==n)
			System.out.println("no is perfect");
		else
			System.out.println("no is not perfect");
	}
	
	static void checkMagic(int n)
	{
		int t,d,s;
		t=n;
		while((t/10)!=0)
		{
			s = 0;
			d = t;
			while(d!=0)
			{
				s = s+(d%10);
				d = d/10;
			}
			t = s;
		}
		if(t==1)
			System.out.println("no is magic");
		else
			System.out.println("no is not magic");
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a nos");
		a = sc.nextInt();
		System.out.println("Enter your choice to check wheteher a no is");
		System.out.println("1 : Prime");
		System.out.println("2 : Perfect");
		System.out.println("3 : Palindrome");
		System.out.println("4 : Armstrong");
		System.out.println("5 : Magic");
		int ch;
		ch = sc.nextInt();
		switch(ch)
		{
			case 1 : checkPrime(a);
					 break;
			case 2 : checkPerfect(a);
					 break;
			case 3 : checkPalindrome(a);
					 break;
			case 4 : checkArmstrong(a);
					 break;
			case 5 : checkMagic(a);
					 break;
			default: System.out.println("wrong choice");
					 break;
		}
	}
}