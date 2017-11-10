import java.util.Scanner;
class PointLiesOnLine
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the points: ");
		System.out.println("For x1 : ");
		int x1 = sc.nextInt();
		System.out.println("For y1 : ");
		int y1 = sc.nextInt();
		System.out.println("For x2 : ");
		int x2 = sc.nextInt();
		System.out.println("For y2 : ");
		int y2 = sc.nextInt();
		System.out.println("For x3 : ");
		int x3 = sc.nextInt();
		System.out.println("For y3 : ");
		int y3 = sc.nextInt();
		double m1 = (y2-y1)/(x2-x1);
		double m2 = (y3-y2)/(x3-x2);
		if(m1==m2)
			System.out.println("the points lie in same line ");
		else
			System.out.println("the points don't lie in same line ");
		
	
	}
}