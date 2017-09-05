import java.util.Scanner;

class PrintBoundary
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter columns : ");
		int cols = sc.nextInt();
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter elements : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Boundes printing : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(i == 0 || i == rows-1)
					System.out.print(matrix[i][j]+"  ");
				else
					if(j == 0 || j == cols-1)
						System.out.print(matrix[i][j]+"  ");
					else
						System.out.print("   ");
			}
			System.out.println();
		}
	}
}