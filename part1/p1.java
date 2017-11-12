class Swap
{
	public static void main(String[] args) 
	{
		int a,b,temp=0;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter two nos");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swapping values are: a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping(without using third variable) values are: a="+a+" b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping(with using third variable) values are: a="+a+" b="+b);
	}
}