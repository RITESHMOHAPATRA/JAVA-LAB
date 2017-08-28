import java.util.Scanner;
class PrintDiagonal
{
    public static void main(String args[])  
    {
      	int i, j;
      	System.out.println("Enter size of a square matrix: ");
      	Scanner s = new Scanner(System.in);
      	int n = s.nextInt();
      	int array[][] = new int[n][n];
      	System.out.println("Enter matrix element row wise:");
       	for(i = 0; i < n; i++)
        	{
         	    for(j = 0; j < n; j++) 
           	    {
                	array[i][j] = s.nextInt();
                	System.out.print(" ");
                  
                }
        	}
      	System.out.println("The primary diagonal elemnts are ");
        	for(i = 0; i < n; i++)
          	{
            	    for(j = 0; j < n; j++)
                  {
                	     if(i==j)
                          System.out.println(array[i][j]);
                  }
              
            }
       	System.out.println("The secondary diagonal elemnts are");
        	for(i = 0; i < n; i++)
          	{
            	    for(j = 0; j < n; j++)
                  {
                      if((i+j)==(n-1))
                          System.out.println(array[i][j]);
                  }
            }
    }
}