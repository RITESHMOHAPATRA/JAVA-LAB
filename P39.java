import java.util.*;
class P39
{
	static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
	static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 public static void main(String args[])
	{
		int m;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the size of the matrix n>3 and n<10");
		m = scan.nextInt();
		int a[][] = new int[m][m];
		int e[] = new int[m*m-4*m+4];
		System.out.println("enter elemnts row wise");
		for(int i = 0 ;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		int k =0;
		int s =0;
		for(int i=1;i<m-1;i++)
		{
			for(int j=1;j<m-1;j++)
			{
				s = s+a[i][j];
				e[k] = a[i][j];
				k++;
			}
		}
		System.out.println("original matrix");
		for(int i = 0 ;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		sort(e,0,m*m-4*m+4-1);
		k=0;
		System.out.println("Sum of non-boundary elemnts = "+s);
		for(int i =1 ;i<m-1;i++)
		{
			for(int j=1;j<m-1;j++)
			{
				a[i][j]=e[k];
			}
			System.out.println();
		}
		System.out.println("Sorted matrix");
		for(int i = 0 ;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
			
	}
}