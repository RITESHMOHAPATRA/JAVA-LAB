import java.util.Scanner;
class FibonacciPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nth term of fibonacci series");
		int n=sc.nextInt();
		int f1 = 0, f2 = 1,f3=0;
		System.out.println("prime no present in fibonacci series upto "+n+" th term");
		for (int i=3;i<=n ;i++ ) 
		{
			f3 = f1 + f2;
			isprime(f3);
			f1 = f2;
			f2 = f3;
		}
		System.out.println("\n"+n+" th term of fibonnaci series is  "+f3);
	
	}
	static void isprime(int n) 
	{
		int flag=0,i;
		for(i=2;i<=n/2;i++)
		{    
		   if(n%i==0)
		   {    
		   		flag=1;    
		   		break;    
		    }    
		}    
		if(flag==0)    
		  	System.out.print(n+" ");	
	}
}
