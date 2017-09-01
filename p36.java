import java.util.Scanner;

class LargestSmallestInArray 
{
	public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the size of the row");
                int r = sc.nextInt();
                System.out.println("enter the size of column");
                int c = sc.nextInt();
                int numbers[][] = new int[r][c];
                
                for (int i=0;i<r ;i++ ) {
                        for (int j=0;j<c ;j++ ) {
                                numbers[i][j] = sc.nextInt();
                        }
                }
                int largest = numbers[0][0];
                int smallest = numbers[0][0];
                for(int i=0; i<r; i++)
                {
                        for (int j=0;j<c ;j++ ) {
                                if(numbers[i][j] > largest)
                                        largest = numbers[i][j];
                                else 
                                if (numbers[i][j] < smallest)
                                        smallest = numbers[i][j];
                        }
                }

               
                System.out.println("Sum of digits = "+(sumdigits(smallest)+sumdigits(largest)));
        }
        private static int sumdigits(int n) 
        {
                int s=0;
                while(n>0)
                {
                    s=s+n%10;
                    n=n/10;
                }
                return s;
                        
        }

}