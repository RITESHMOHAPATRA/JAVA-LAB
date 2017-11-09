import java.io.*;
import java.util.*;
class prog45
{
	public static void main(String args[])
	{
	int d=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decoded text");
		String s=sc.nextLine()+" ";
		String a="";
		s.toLowerCase();
		System.out.println("Enter the shift value");
		int n=sc.nextInt();
		n--;
		if(n>26)
		{
			System.out.println("INVALID SHIFT");
			System.exit(0);
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				int j=s.charAt(i);
				j=j-97;
				int b=(j+n)%26;
				b=b+97;
				if(b==113)
				{
					j=j+97;
					if(j==s.charAt(i+1))
					{
						d=1;
						continue;
					}
					if(d==1)
					{
						a=a+" ";
						d=0;
						continue;
					}
				}
				else
					a+=(char)b;
			}
		}
		a.trim();
		a.toUpperCase();
		System.out.println(a);
	}
}