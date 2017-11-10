import java.io.File;
import java.io.FilenameFilter;
 
class FileFilter {
 
    public static void main(String a[]){
        File file = new File("C:/Users/b115045/Documents/");
        String[] files = file.list(new FilenameFilter() {
             
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".cpp")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:files){
            System.out.println(f);
        }
    }
}