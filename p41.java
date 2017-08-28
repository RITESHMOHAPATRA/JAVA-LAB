import java.util.Scanner;
import java.util.Arrays;
 
class RemoveDuplicate
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        s = new String(temp);

        int res_ind = 1, ip_ind = 1;
        char arr[] = s.toCharArray();
         
        while (ip_ind != arr.length)
        {
            if(arr[ip_ind] != arr[ip_ind-1])
            {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
           
        }
        s = new String(arr);
        s = s.substring(0,res_ind);

        System.out.println(s);
    }
}