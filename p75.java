import java.util.Scanner;
class BinaryCheck 
{
    static boolean isBinaryNumber(int binary)
    {
         
        boolean status = true;
        while(true)
        {
            if(binary == 0)
            {
                break;
            } 
            else 
            {
                int tmp = binary%10;
                if(tmp > 1)
                {
                    status = false;
                    break;
                }
                binary = binary/10;
            }
        }
        return status;
    }
     
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n = sc.nextInt();
        if(isBinaryNumber(n))
            System.out.println("no is binary ");
        else
            System.out.println("no is not binary ");
    }
}