import java.util.Scanner;
class DecimalToBinary 
{
    public static void main(String[] args) 
    {
        int n,a;
        Scanner s = new Scanner(System.in);
        String x="";
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number: "+x);
    }
}