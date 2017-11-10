import java.util.*;
class Count
{

    public static void main(String[] args)
    {
        System.out.println("Enter  a sentence:"); 
        Scanner sc = new Scanner(System.in); 
        String sentence = sc.nextLine();
        int nv=0,nu=0,nl=0;
        for (char letter : sentence.toCharArray()) 
        {
            if(Character.isLowerCase(letter)) 
            {
                nl++;
            } 
            else if(Character.isUpperCase(letter))
            {
                nu++;
            }
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
              nv++;
        }
        System.out.println("No of vowels: "+nv);
        System.out.println("No of lowercase characters : "+nl);
        System.out.println("No of uppercase characters : "+nu);
        sc.close(); 
    }
}