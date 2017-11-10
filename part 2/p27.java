import java.io.File;
import java.text.SimpleDateFormat;

class GetFileLastModifiedTime
{
    public static void main(String[] args)
    {
	File file = new File("p27.java");

	System.out.println("Before Format : " + file.lastModified());

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	System.out.println("After Format : " + sdf.format(file.lastModified()));
    }
}