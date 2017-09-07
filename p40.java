import java.util.Scanner;

class Anagrams 
{
	static void anagrams(char str[],int l,int r)
	{
	    if(l == r)
	        System.out.println(str);
	    else
	    for(int i=l;i<=r;i++)
	    {
	            swap((str[l]),(str[i]));
	            anagrams(str,l+1,r);
	            swap((str[l]),(str[i]));
	    }
	}
	private static void swap(char c, char d) 
	{
		char t = c;
		c = d;
		d = t;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.next();
		char c[] = str.toCharArray();
		anagrams(c,0,c.length-1);
	}
}