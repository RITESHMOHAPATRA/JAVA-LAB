import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
 
class TemporaryFile
{
   public static void main(String[] args)
   {
      File temp;
      try
      {
         temp = File.createTempFile("myTempFile", ".txt");
 
         //write data on temporary file
         BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
         bw.write("This is the temporary data written to temp file");
         bw.close();
 
         System.out.println("Written to Temp file : " + temp.getAbsolutePath());
      } catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}