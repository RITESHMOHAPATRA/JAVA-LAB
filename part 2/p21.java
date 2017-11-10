import java.io.File;
class FilesListFromFolder 
{
    public static void main(String a[]){
        File file = new File("C:/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());
        }
    }
}