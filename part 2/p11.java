import java.util.ArrayList;
import java.util.Iterator;
class IteratorCollection {
 
    public static void main(String a[]){
        ArrayList<String> arr = new ArrayList<String>();
        //adding elements to the end
        arr.add("First");
        arr.add("Second");
        arr.add("Third");
        arr.add("Random");
        Iterator<String> itr = arr.iterator();
         while(itr.hasNext()){
            if("Third".equals(itr.next())){
                itr.remove();
            }
		}
        
        System.out.println("After remove:");
        System.out.println(arr);
    }
}