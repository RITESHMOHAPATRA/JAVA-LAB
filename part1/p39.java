class Test
{
    static int A[][],B[],m,n; 
    public static void input()
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the size of the square matrix : ");
        m=sc.nextInt();
        if(m<4 || m>10)
        {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        else
        {
            A = new int[m][m];
            n = (m-2)*(m-2);
            B = new int[n];     
            System.out.println("Enter the elements of the Matrix : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print("Enter a value : ");
                    A[i][j]=sc.nextInt();
                }
            }
        }
    }
    public static void convert(int s)
    {
        int x=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i != 0 && j != 0 && i != m-1 && j != m-1)
                {
                    if(s==1)
                        B[x] = A[i][j];
                    else
                        A[i][j] = B[x];
                    x++;
                }
            }
        }
    } 
    public static void sortArray()
    {
        int c = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(B[i]>B[j])
                {
                    c = B[i];
                    B[i] = B[j];
                    B[j] = c;
                }
            }
        }
    } 
    public static void printArray()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    } 
    public static void printDiagonal()
    {
        int sum = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j || (i+j)==m-1)
                {
                    System.out.print(A[i][j]+"\t");
                    sum = sum + A[i][j];
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("Sum of the Diagonal Elements is: "+sum);
    } 
    public static void main(String args[])
    {
        input();
        System.out.println("The original matrix:");
        printArray(); 
        convert(1); 
        sortArray(); 
        convert(2); 
        System.out.println("The Rearranged matrix is:");
        printArray();
        System.out.println("The Diagonal Elements are:");
        printDiagonal();
    }
}