class Fact
{
	public static void main(String[] args) 
	{
		int n,i;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		for(n=1;n<=3;n++)
		{
			int fact=1;
			while(n>0)
			{
				fact=fact*n--;
			}
			System.out.println("factorial of "+n+"is:"+fact);

			System.out.println("Multiplication table of "+n+"is:");
			for(i=1;i<=10;i++)
			{
				System.out.println(n+" * "+i+" = "+(n*i));
			}
		}	
	}
}