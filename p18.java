import java.util.Scanner;
class Circle
{
    public static void main(String[] args) 
    {
                
        int r,x,y,x1,y1,check;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of a circle");
        r=sc.nextInt();
        System.out.println("enter the co-ordinates of circle");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("enter the co-ordinates of point");
        x=sc.nextInt();
        y=sc.nextInt();
        check=((x-x1)*(x-x1))+((y-y1)*(y-y1));
        if(check<(r*r))
                System.out.println("point lies in the circle");
        else 
        if(check>(r*r))
               System.out.println("point lies outside  the circle");
        else
               System.out.println("point lies on the circle");
    }
}