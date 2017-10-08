import java.util.Scanner;
class HtmlTagRemover {
 
    public static void main(String a[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(" enter text with html tags");
        String text = sc.nextLine();
        text = text.replaceAll("[<].*?[>]", "");
        System.out.println("text  without tags = "+text+"\n");
    }
}