import java.util.*;
 
class CommonElements
{
    
    static void printIntersection(int arr1[],int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
         
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(hs.contains(arr2[i])){
                hs1.add(arr2[i]);
            }
                 
        }
         
        System.out.println(hs1);
    }
     
    
    public static void main(String[] args) 
    {
         
        Scanner scan = new Scanner(System.in);
           
           System.out.print("Enter Array 1 Size : ");
           int size1 = scan.nextInt();
           int arr1[] = new int[size1];
           
           System.out.print("Enter Array 1 Elements : ");
           for(int i=0; i<size1; i++)
           {
               arr1[i] = scan.nextInt();
           }
           
           System.out.print("Enter Array 2 Size : ");
           int size2 = scan.nextInt();
           int arr2[] = new int[size2];

           for(int i=0; i<size2; i++)
           {
               arr2[i] = scan.nextInt();
           }

           printIntersection(arr1,arr2);

         
    }
}