import java.util.Scanner;
class SortingArray
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " +n+" elements :");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Choose Sorting Technique :");
		System.out.println("1 : Bubble Sort");
		System.out.println("2 : Selection Sort");
		System.out.print("Your Choice : ");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: bubbleSort(a,n);
					break;
			case 2: selectionSort(a,n);
					break;
			default : System.out.println("Invalid Choice !");
		}
		System.out.println("Sorted Array :");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	static void bubbleSort(int a[],int n)
	{
		int t;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
	static void selectionSort(int a[],int n)
	{
		int t, min;
		for(int i=0;i<n-1;i++)
		{
			min = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[min]>a[j])
					min = j;
			}
			if(min!=i)
			{
				t = a[min];
				a[min] = a[i];
				a[i] = t;
			}
		}
	}
}
