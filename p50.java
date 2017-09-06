import java.util.Scanner;

class CheckDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		boolean status = true;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				status = false;
				break;
			}
		}
		if(status)
			System.out.println("no digits");
		else
			System.out.println("Contains Digit");
	}
}