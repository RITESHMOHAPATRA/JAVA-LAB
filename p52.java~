import java.util.*;
class p52{
  static int a = 0;
	public static void anagram(String permutation,String input){
		if(input.isEmpty()){
			a++;
			System.out.println(a + "." + permutation);
		}else{
			for(int i = 0; i < input.length();i++){
				anagram(permutation + input.charAt(i),input.substring(0,i) + input.substring(i+1,input.length()));
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a word:");
		String s = sc.nextLine();
		anagram("",s);
	}
}
