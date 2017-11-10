import java.util.Scanner;
class Quadratic
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter co-efficients of an quadratic equation: ");
		System.out.println("For a : ");
		int a = sc.nextInt();
		System.out.println("For b : ");
		int b = sc.nextInt();
		System.out.println("For c : ");
		int c = sc.nextInt();
		if((b*b-4*a*c)>0)
		{
			double r1 = (-b+Math.sqrt(b*b-4*a*c))/2;
			double r2 = (-b-Math.sqrt(b*b-4*a*c))/2;
			System.out.println("The roots are = "+r1+" and "+r2);
		}
		else
			System.out.println("The roots are =complex");
	
	}
}