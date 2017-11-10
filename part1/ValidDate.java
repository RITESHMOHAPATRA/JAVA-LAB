/* solution to question - 19 */
import java.util.*;
class ValidDate{
    
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the date and month:");
		int date = sc.nextInt();
		int month = sc.nextInt();
		
		int days_in_month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			
        if(month > 0 || month <= 12){
	       if(date < 0 || date > days_in_month[month])
		      System.out.println("Invalid date.");
	       else
		      System.out.println("Valid date.");
        }
        else{
	         System.out.println("Invalid date.");
        }		
    }
}