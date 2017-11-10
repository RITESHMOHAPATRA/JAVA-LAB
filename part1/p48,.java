import java.util.Scanner;

class StartEndVowel 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line : ");
		String str = sc.nextLine();
		String words[] = str.split(" ");
		int count = 0;
		for(String s : words)
			if(check(s))
				count++;
		System.out.println("Number of words : "+count);
	}

	private static boolean check(String s)
	{
		if((s.charAt(0) == 'a' ||s.charAt(0) == 'e'||s.charAt(0) == 'i'||s.charAt(0) == 'o'||s.charAt(0) == 'u'||s.charAt(0) == 'A'||s.charAt(0) == 'E'||s.charAt(0) == 'I'||s.charAt(0) == 'O'||s.charAt(0) == 'U') && (s.charAt(s.length()-1) == 'a' ||s.charAt(s.length()-1) == 'e'||s.charAt(s.length()-1) == 'i'||s.charAt(s.length()-1) == 'o'||s.charAt(s.length()-1) == 'u'||s.charAt(s.length()-1) == 'A'||s.charAt(s.length()-1) == 'E'||s.charAt(s.length()-1) == 'I'||s.charAt(s.length()-1) == 'O'||s.charAt(s.length()-1) == 'U'))
			return true;
		else
			return false;
		
	}
}