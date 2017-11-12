class Series
{
	public static void main(String[] args) 
	{
		int n,ch;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the no of terms in series");
		n=sc.nextInt();
		System.out.println("choose the type of series");
		System.out.println("1. 12+22+32+42+......+n");
		System.out.println("2. 1-2+3-4+.......n");
		System.out.println("3. 1!+2!+3!+......n");
		System.out.println("4. 2/9-5/13+8/17+......n");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				int sum1=0;
				for(int i=1;i<=n;i++)
				{
					sum1+=i*10+2;
				}
				System.out.println("value of the series is:"+sum1);
				break;
			case 2:
				int sum2=0;
				for(int i=1;i<=n;i=i+2)
				{
					sum2+=i;
				}
				for(int j=2;j<=n;j=j+2)
				{
					sum2-=j;
				}
				System.out.println("value of the series is:"+sum2);
				break;
			case 3:
				int sum3=0;
				int i=1;
				while(i<=n)
				{
					int fact=1;
					int j=1;
					while(j<=i)
					{
						fact=fact*j;
						j=j+1;
					}
					sum3+=fact;
					i=i+1;
				}
				System.out.println("value of the series is:"+sum3);
				break;
			case 4:
				float sum4=0,sum5=0,sum6=0;
				int a=2,b=9;
				for(int k=1;k<=n;k++)
				{
					if(k%2==0)
						sum4=(sum4+a)/b;
					else
						sum5=(sum5+a)/b;
					sum6=sum5-sum4;
					a=a+3;
					b=b+4;
				}
				System.out.println("value of the series is:"+sum6);
				break;
			default:
				System.out.println("invalid choice");
		}
	}	
}