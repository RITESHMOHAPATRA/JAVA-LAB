import java.util.Arrays;
import java.util.Scanner;

class Lexicographical 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line : ");
		String str = sc.nextLine();
		String s[] = str.split(" ");
		Arrays.sort(s);
		System.out.println("Lexicographical Order : ");
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
	}
}