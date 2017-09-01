import java.util.Scanner;

class SmithNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,a,b;
		x=sc.nextInt();
		a=sumdigits(x);
		b=primfact(x);
		if(a==b)
			System.out.println("yes");
		else
			System.out.println("No");
	}
	private static int primfact(int n) {
		int i=2, sum=0;
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+sumdigits(i); 
                n=n/i;
            }
            else
                i++;
        }
        return sum;
		
	}
	private static int sumdigits(int n) {
		int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
		
	}
}