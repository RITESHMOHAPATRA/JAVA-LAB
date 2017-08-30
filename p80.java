import java.util.*;
class ToggleCase
{

    public static void main(String[] args)
    {
        System.out.println("Enter  a sentence:"); 
        Scanner sc = new Scanner(System.in); 
        String sentence = sc.nextLine();
        System.out.println("toggled String:" + toggleString(sentence)); 
        sc.close(); 
    }

    public static String toggleString(String sentence)
    {
      StringBuilder toggled = new StringBuilder(sentence.length());
      for (char letter : sentence.toCharArray()) 
      {
          if(Character.isUpperCase(letter)) 
          {
              letter = Character.toLowerCase(letter);
          } 
          else if(Character.isLowerCase(letter)) 
          {
              letter = Character.toUpperCase(letter);
          }
          toggled.append(letter);
      }
     return toggled.toString();
    }
}