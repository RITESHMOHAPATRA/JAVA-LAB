/* solution to question - 76 */
import java.util.*;
class SpaceRemoval{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("\nEnter a string:");
    String inp = sc.nextLine();
    inp = inp.replaceAll(" +"," ");
    System.out.println("After space removal:" + inp);
  }
}
