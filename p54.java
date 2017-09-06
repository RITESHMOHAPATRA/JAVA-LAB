import java.util.*;
class HighestOccurred{
  public static void main(String[] args) {
    System.out.println("Enter a string");
    String s = (new Scanner(System.in)).nextLine();
    getMaxViaHashmap(s);
  }

private static void getMaxViaHashmap ( String s) 
    {     
         HashMap<Character, Integer> map = new HashMap<Character, Integer>(); 
         char maxappearchar = ' ';
         for (int i = 0; i < s.length(); i++)
         {
              if ( map.containsKey(s.charAt(i)))
              {
                    map.put (s.charAt(i), map.get(s.charAt(i)) + 1 );
              }       
              else
              {
                map.put (s.charAt(i), 1);
              }           
         }  


          int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap    
            for (Map.Entry<Character, Integer> entry : map.entrySet())
            {  
                if (entry.getValue()==maxValueInMap)
                {
                    System.out.println("the max char is : " + entry.getKey() + "  and displayed  " +maxValueInMap+ "  times");     // Print the key with max value
                    maxappearchar = entry.getKey();
                }

            }
    }
  }