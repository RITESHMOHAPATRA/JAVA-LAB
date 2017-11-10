import java.util.ArrayList;
import java.util.Collections;
class MyArrayListShuffle {
 
    public static void main(String a[]){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("PHP");
        list.add("JavaScript");
        list.add("Python");
         
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for(String str: list){
            System.out.println(str);
        }
         
    }
}