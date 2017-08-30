import java.util.Scanner;
import java.util.Arrays;
class DistinctElement
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elemnts in an array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter elemnts");
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res_ind = 1, ip_ind = 1;
        while (ip_ind != a.length)
        {
            if(a[ip_ind] != a[ip_ind-1])
            {
                a[res_ind] = a[ip_ind];
                res_ind++;
            }
            ip_ind++;
           
        }
        System.out.println("DistinctElement");
        for(int i = 0;i<res_ind;i++)
        {
            System.out.println(a[i]);
        }
    }
}