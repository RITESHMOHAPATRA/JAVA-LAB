import java.util.*;
class SpiralOrderInMatrix
{
    static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
        while (k < m && l < n)
        {
            for (i = l; i < n; ++i)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;

            for (i = k; i < m; ++i)
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;
  
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }
  
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;    
            }        
        }
    }

    public static void main (String[] args) 
    {
        int r,c;
        System.out.print("Enter the number of row of the square matrix:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.print("Enter the number of column of the square matrix:");
        c = sc.nextInt();
        int a[][] = new int[r][c];

        for(int i = 0;i < r;i++){
          for(int j = 0;j<c;j++){
            a[i][j] = sc.nextInt();
          }
        }
        spiralPrint(r,c,a);
        System.out.println();
    }
}