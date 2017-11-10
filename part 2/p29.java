import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
 
class PrepStResultSet {
 
public static void main(String a[]){
         
        Connection con = null;
        ResultSet rs = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                    getConnection("jdbc:oracle:thin:@localhost:1521:XE"
                        ,"user","password");
            String query = "select * from emp where empid=?";
			Statement st = con.createStatement();
			rs = st.executeQuery(query)
            while(rs.next()){
                System.out.println(rs.getString("name")+" -- "+rs.getInt("salary"));
            }
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