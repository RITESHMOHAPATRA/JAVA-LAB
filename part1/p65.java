import java.util.Scanner;
class CircularPrime
{
	public static void main(String args[]) 
		{
		int n;
		System.out.println("Enter a no");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(isCircularPrime(n))
			System.out.println("no is circular prime");
		else
			System.out.println("no is not circular prime");

	}
	static boolean isCircularPrime(int n)
	{
		int a,flag = 1;
		String s;
		a = n;
		do
		{
		 	if(isPrime(a))
			{
				s = String.valueOf(a);
				s = s.substring(1)+s.charAt(0);
				a = Integer.parseInt(s);
			}
			else
			{
				flag=0;
				break;
			}
		}while(a!=n);
		if(flag==1)
			return true;
		else
			return false;
	}

	static boolean isPrime(int number)
	{
		if( number < 2 ) 
			return false;
        else 
        if( number == 2 ) 
        	return true;
        else 
        if(number % 2 == 0) 
        	return false;
        else
        {
            int limit = (int) Math.sqrt( number );
            for( int i = 3 ; i <= limit ; i+=2 )
            {
                if( number %i == 0 )
                {
                    return false;
                }
            }
        }
        return true;
	}
}

