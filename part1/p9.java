class Test
{
	public static void main(String[] args) 
	{
		int n,ch;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter a no");
		n=sc.nextInt();
		System.out.println("1.even digits 2.odd digits");
		System.out.println("enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				int even=0,digit;
				while(n>0)
				{
					digit=n%10;
					if(digit%2==0)
						even++;
					n=n/10;
				}
				System.out.println("no of even digits:"+even);
				break;
			case 2:
				int odd=0,digit1;
				while(n>0)
				{
					digit1=n%10;
					if(digit1%2==1)
						odd++;
					n=n/10;
				}
				System.out.println("no of odd digits:"+odd);
				break;
			default:
				System.out.println("invalid choice");
		}
	}
}