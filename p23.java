import java.util.Scanner;

class q23 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int num=sc.nextInt();
		 for(int i=2;i<=num/2;i++)
		    {
		       if((num%i==0) && (isprime(i)))
		       {
		    	   System.out.println(i+" ");
		       }
		    }
	}

   static boolean isprime(int n) 
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
	  	return true;
	  else 
		  return false;
	
	}
}
