import java.util.*;
class SieveOfEratosthenes
{
    void sieveOfEratosthenes(int n)
    {
        
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
     
    // Driver Program to test above function
    public static void main(String args[])
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no to find prime no smaller than it ");
        n = sc.nextInt();
        SieveOfEratosthenes g = new SieveOfEratosthenes();
        g.sieveOfEratosthenes(n);
    }
}
 