import java.util.*;
class Anagrams
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the word");
    String s=sc.next();
    permute(s,0,s.length()-1);
  }
  static void permute(String a,int l,int r)
  {
    if(l==r)
    {
      System.out.println(a);
    }
    else
    {
      for(int i=l;i<=r;i++)
      {
        a=swap(a,l,i);
        permute(a,l+1,r);
        a=swap(a,l,i);
      }
    }
  }
  static String swap(String a,int i,int j)
  {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i] ;
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }
}
