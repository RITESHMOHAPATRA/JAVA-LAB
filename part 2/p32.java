import java.sql.*;
 
class InsertBlob {
 
public static void main(String a[]){
         
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                    getConnection("jdbc:oracle:thin:@localhost:1521:XE"
                        ,"user","password");
			PreparedStatement pstmt = conn.prepareStatement ("INSERT INTO t1 VALUES (?,?)");
			pstmt.setInt (1, 100);
			File fBlob = new File ( "image1.gif" );
			FileInputStream is = new FileInputStream ( fBlob );
			pstmt.setBinaryStream (2, is, (int) fBlob.length() );
			pstmt.execute ();
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            con.close();
        }
    }
}