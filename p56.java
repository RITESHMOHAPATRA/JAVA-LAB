import java.util.Arrays;
import java.util.Scanner;

class ArrangeParagraph 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter paragraph : ");
		String str = sc.nextLine();
		str = str.replace("?", ".");
		str = str.replace("!", ".");
		String s[] = str.split("\\.");
		int arr[] = new int[s.length];
		int i=0;
		for(String t:s)
		{
			arr[i] = t.length()-t.replaceAll(" ", "").length();
			i++;
		}
		System.out.println(Arrays.toString(arr));
		sortLines(s,arr);
	}

	private static void sortLines(String[] s, int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Lines : ");
		for(String t:s)
			System.out.println(t);
	}
}