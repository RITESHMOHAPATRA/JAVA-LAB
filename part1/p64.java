import java.util.Scanner;

class CaeserCipher 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		StringBuffer str = new StringBuffer(sc.nextLine());
		if(str.length() <=3 || str.length() >=100)
			System.out.println("Invalid String.");
		else
		{
			for(int i=0;i<str.length();i++)
			{
				if(!Character.isAlphabetic(str.charAt(i)))
					continue;
				else
				{
					if((str.charAt(i)>='A' && str.charAt(i)<='M')||(str.charAt(i)>='a' && str.charAt(i)<='m'))
						str.setCharAt(i, (char)(str.charAt(i)+13));
					else 
					if((str.charAt(i)>='N' && str.charAt(i)<='Z')||(str.charAt(i)>='n' && str.charAt(i)<='z'))
						str.setCharAt(i, (char)(str.charAt(i)-13));
				}
			}
			System.out.println("Encrypted Text : "+str);
	}
		}
		
}