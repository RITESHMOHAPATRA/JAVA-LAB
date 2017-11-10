import java.io.*;
class Record //superclass
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name[];
        int rnk[];
         
        Record()
        {
            name = new String[50];
            rnk = new int[50];
        }
         
        void readvalues()throws IOException
        {
            System.out.println("Enter name and ranks");
            for(int i=0;i<50;i++)
            {
                System.out.print("Enter name of student "+(i+1)+" : ");
                name[i]=br.readLine();
                System.out.print("Enter his rank : ");
                rnk[i]=Integer.parseInt(br.readLine());
            }
        }
         
        void display()
        {
            System.out.println("Name"+"\t"+"Rank");
            for(int i=0;i<50;i++)
            {
                System.out.println(name[i]+"\t"+rnk[i]);
            }
        }
    } //end of superclass Record
 
class Rank extends Record //subclass
    {
        int index;
         
        Rank()
        {
            super(); //invoking the constructor of superclass
            index = 0;
        }
         
        void highest()
        {
            int min = rnk[0];
            for(int i=0;i<50;i++)
            {
                if(rnk[i]<min)
                {
                    min = rnk[i];
                    index = i;
                }
            }
        }
         
        void display()
        {
            super.display(); 
            highest(); 
            System.out.println("Top most rank = "+rnk[index]);
            System.out.println("Student with topmost rank = "+name[index]);
        }
    } //end of subclass Rank
 
 
class P35
    {
        public static void main(String args[])throws IOException
        {
            Rank ob=new Rank(); //creating object of subclass
            ob.readvalues(); //calling radvalues() function of superclass to input the names and ranks
            ob.display(); //calling display() function of subclass
        }
    }