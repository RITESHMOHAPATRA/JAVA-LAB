import java.util.Scanner;

class Terminate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line : ");
		StringBuffer str = new StringBuffer(sc.nextLine());
		if(str.charAt(str.length()-1) == '.' ||str.charAt(str.length()-1) == '!' ||str.charAt(str.length()-1) == '?')
		{
			str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
			for(int i=0;i<str.length();i++)
			{
				if(i != str.length()-1)
					if(str.charAt(i) == ' ')
						str.setCharAt(i+1, Character.toUpperCase(str.charAt(i+1)));
			}
			System.out.println(str);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}