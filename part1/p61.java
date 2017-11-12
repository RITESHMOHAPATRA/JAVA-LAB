class Test
{   
    public static void main(String args[])
    {   
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter the Text: "); 
        String s=sc.nextLine();
        int l=s.length();
        s=s.toUpperCase(); 
        s=s + " "; 
        if(l>=100) 
            System.out.println("Invalid Length of Coded Text");
        else
        {
            System.out.print("Enter Shift Value: ");
            int shift=sc.nextInt();
 
            if(shift<1 || shift>26)
                System.out.println("Invalid Shift Value");
            else
            {
                int a,b;
                char ch1,ch2;
                String dec="";     
                for(int i=0;i<l;i++)
                {
                    ch1=s.charAt(i); 
                    ch2=s.charAt(i+1); 
                    a=ch1+shift-1; 
                    b=ch2+shift-1; 
                    if((char)a=='Q' && (char)b=='Q')
                    {
                        a=32;
                        i++;
                    }
                    if(a>90)
                        a-=26;
                    if(ch1!=' ')
                        dec+=(char)a;
                }
            System.out.println("The Decoded Text is: "+dec);
            }
        }
    }
}
