/* solution to question - 38 */
import java.util.*;
class MergeArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of the first array:");
		int size1 = sc.nextInt();
		System.out.print("\nEnter the size of the second array:");
		int size2 = sc.nextInt();
		
		System.out.print("\nEnter the first array elements:");
		int first[] = new int[size1];
		for(int i = 0; i < size1;i++){
			first[i] = sc.nextInt();
		}
		Arrays.sort(first);
		System.out.print("\nEnter the second array elements:");
		int second[] = new int[size2];
		for(int i = 0; i < size2;i++){
			second[i] = sc.nextInt();
		}
		Arrays.sort(second);
		int third[] = new int[size1 + size2];
		
		int i = 0,j = 0,k = 0;
		while(i < first.length && j < second.length){
			if(first[i] == second[j]){
					third[k++] = first[i];
					i++;
					j++;
			}
			else if(first[i] < second[j]){
				third[k++] = first[i];
				i++;
			}
			else if(first[i] > second[j]){
				third[k++] = second[j];
				j++;
			}
		}
		while(i < first.length){
			third[k++] = first[i];
			i++;
		}
		while(j < second.length){
			third[k++] = second[j];
			j++;
		}
		
		System.out.print("\nMerged array:");
		for(int m = 0; m < k;m++){
			System.out.print(third[m] +" ");
		}
	}
}