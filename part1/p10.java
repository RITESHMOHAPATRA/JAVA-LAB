class Test
{
	public static void main(String[] args) 
	{
		int n,ch;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the no of terms in series");
		n=sc.nextInt();
		System.out.println("1.fibonacci series 2.tribonacci series");
		System.out.println("enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				int a=0,b=1,c;
				System.out.println("Fibonacci series:");
				System.out.print(" "+a+" "+b);
				for(int i=1;i<=n;i++)
				{
					c=a+b;
					System.out.print(" "+c);
					a=b;
					b=c;
				}
				System.out.println();
				break;
			case 2:
				int a1=0,b1=0,c1=1;
				int d1=a1+b1+c1;
				System.out.println("Tribonacci series:");
				System.out.print(" "+a1+" "+b1+" "+c1);
				for(int j=4;j<=n;j++)
				{
					System.out.print(" "+d1);
					a1=b1;
					b1=c1;
					c1=d1;
					d1=a1+b1+c1;
				}
				System.out.println();
				break;
			default:
				System.out.println("invalid choice");
		}	
	}
}