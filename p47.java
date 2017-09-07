import java.util.Scanner;

class CountPalindromes 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int count = 0;
		String ar[] = str.split(" ");
		for(String s: ar)
		{
			if(checkPalindrome(s))
			{
				count++;
				System.out.println(s);
			}
		}
		System.out.println("no of palindrome words : "+count);
	}

	private static boolean checkPalindrome(String str) 
	{
		return str.equals(new String(new StringBuffer(str).reverse()));
	}
}