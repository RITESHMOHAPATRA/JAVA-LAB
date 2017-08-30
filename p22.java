import java.util.Scanner;
class Primorial {
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);
	int num;
    System.out.println("Enter the no");
	num=sc.nextInt();
	long fact=1;
    for(int i=num;i>1;i--)
    {
        int c=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            fact=fact*i;
        }
    }
    System.out.println("Primorial is  = "+fact);
}
}
