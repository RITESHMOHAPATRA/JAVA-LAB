import java.io.*;
import java.util.*;
class ValidShuffle
{
	public static void main(String arghs[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 words");
		String a=sc.next();
		a=a+sc.next();
		System.out.println("Enter the word to check with");
		String b=sc.next();
		if(a.length()!=b.length())
		{
			System.out.println("Wrong word");
		}
		else
		{
			char x[]=b.toCharArray();
			char y[]=a.toCharArray();
			for(int i=0;i<x.length;i++)
			{
				for(int j=0;j<y.length;j++)
				{
					if(x[i]==y[j])
					{
						x[i]='0';
						y[j]='0';
						break;
					}
				}
			}
			for(int i=0;i<x.length;i++)
			{
				if(x[i]!='0'||y[i]!='0')
				{
					System.out.println("Wrong word");
					System.exit(0);
				}
			}
			System.out.println("Word matched");
		}
	}
}