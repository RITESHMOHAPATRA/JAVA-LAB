import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
class BlobInsert {
 
    public static void main(String a[]){
         
        Connection con = null;
        PreparedStatement ps = null;
        InputStream is = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                    getConnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>"
                        ,"user","password");
            ps = con.prepareCall("insert into student_profile values (?,?)");
            ps.setInt(1, 101);
            is = new FileInputStream(new File("Student_img.jpg"));
            ps.setBinaryStream(2, is);
            int count = ps.executeUpdate();
            System.out.println("Count: "+count);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            try{
                if(is != null) is.close();
                if(ps != null) ps.close();
                if(con != null) con.close();
            } catch(Exception ex){}
        }
    }
}