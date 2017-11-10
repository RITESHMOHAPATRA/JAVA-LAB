import java.util.Scanner;
class SumofPrimeInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length oF THE ARRAY");
		int n=sc.nextInt();
		int a[] = new int[n];
		int s= 0;
		System.out.println("enter elements");
		for (int i=0;i<n ;i++ ) 
		{
			a[i] = sc.nextInt();
			if(isprime(a[i]))
			{
				s = s+a[i];
			}

		}
		System.out.println("elemnts in the  array");
		for (int i=0;i<n ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nsum of prime nos in the array = "+s);
	}
	static boolean isprime(int n) 
	{
		int flag=0,i;
		if(n==1)
			return false;
		for(i=2;i<=n/2;i++)
		{    
		   if(n%i==0)
		   {    
		   		flag=1;    
		   		break;    
		    }    
		}    
		if(flag==0)    
		  	return true;
		else	
			return false;
	}
}
