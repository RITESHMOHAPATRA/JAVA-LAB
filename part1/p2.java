import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 3 sides of a traingle");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if((a+b)>c || (b+c)>a || (c+a)>b)
		{
			if(a==b && b==c)
			System.out.println("Trainagle is equilatral");
			else
			if(a==b || b==c || c==a)
			{
				System.out.println("Trainagle is isoceles");
			}
			else
			if(a*a=b*b+c*c || b*b=a*a+c*c || c*c=a*a+b*b)
			{
				System.out.println("Trainagle is right angled");
			}
			else
			{
				System.out.println("Trainagle is scalar");
			}		
		}
		
	}
}