import java.util.Scanner;
class MultiplicationTableFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
		int i;
		for(i=1;i<=n;i++) 
		{
			System.out.println(n+" x "+i+" = "+(n*i));
			System.out.println("factorial is "+fact(n*i));
		}
}

	private static long fact(int n) 
	{
	 	if(n==0)
         	return 1;
        return n*fact(n-1);
	}
}
