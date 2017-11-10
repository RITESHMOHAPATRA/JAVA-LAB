/* solution to question-27 */
/* Solution to question-28 */
import java.util.*;
import java.lang.*;

class InvertibleMatrix {
  int determinant(int [][] a,int n){
    int det = 0;
    if(n == 1)
      return a[0][0];
    else if(n == 2)
      return (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
    else{
      int m[][] = new int[n-1][n-1];
      int i = 0;
      for(int j = 0;j<n;j++){
        int x = 0;
        for(int k = i+1;k < n; k++){
          int y = 0;
          for(int l = 0;l < n;l++){
            if(l != j){
              m[x][y] = a[k][l];
              y++;
            }
          }
          x++;
        }
        det += Math.pow(-1,j) * a[i][j] * determinant(m,n-1);
      }
    }
    return det;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter the number of row of the square matrix:");
    int n = sc.nextInt();

    System.out.println("Enter the matrix elements.");
    int a[][] = new int[n][n];

    for(int i = 0;i < n;i++){
      for(int j = 0;j<n;j++){
        a[i][j] = sc.nextInt();
      }
    }

    InvertibleMatrix dt = new InvertibleMatrix();
    int det = dt.determinant(a,n);

    if(det != 0)
      System.out.println("Invertible Matrix.");
    else
      System.out.println("Non invertible Matrix.");
  }
}
