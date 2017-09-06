import java.util.Scanner;

class CountVowels 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line : ");
		String str = sc.nextLine();
		String words[] = str.split(" ");
		System.out.println("Vowels List : \n");
		for(String s : words)
			System.out.println(s+" ---> "+count(s));
	}

	private static int count(String s) 
	{
		
		int c = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a' ||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U')
				c++;
		}
		return c;
	}
}