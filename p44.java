import java.util.Scanner;

class RotateMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		System.out.println("Enter the elements : ");
		int arr[][] = new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				arr[i][j] = sc.nextInt();
		}
		System.out.println("Original Matrix : ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		int temp[][] = new int[size+1][size+1];
		int k=0;
		for(int i=size-1;i>=0;i--)
		{
			for(int j=0;j<size;j++)
			{
				temp[k][j] = arr[j][i];
				
			}k++;
		}
		System.out.println("Rotated matrix : ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				System.out.print(temp[i][j]);
			System.out.println();
		}
	}
}