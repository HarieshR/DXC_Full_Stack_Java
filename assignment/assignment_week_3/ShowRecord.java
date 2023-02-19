package assignment_week_3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ShowRecord {

   private static final String url = "jdbc:mysql:///Books";
   private static final String user = "root";
   private static final String password = "159951";

	 public void show() {

	     Connection con = null;

	     try {

	        con = DriverManager.getConnection(url, user, password);
		    Statement st = con.createStatement();
	     	              
	    	String query = "SELECT * FROM bookDetails";
	    	ResultSet rs = st.executeQuery(query);
	    	
			boolean flag = false;
			while (rs.next()) {
			     flag = true;
			     System.out.println(rs.getInt(1) + " " + rs.getString(2) + 
			    		 " " + rs.getString(3)+ " " +rs.getString(4));
			}
			
			if (flag == true) {
			     System.out.println("\nRecords retrieved and displayed");
			} else {
			     System.out.println("Record not found");
			}

	     } catch(SQLException se) {
	        se.printStackTrace();
	     } catch(Exception e) {
	        e.printStackTrace();
	     }

	     finally {
	        try {
	           if(con != null) con.close();
	        } catch(SQLException se) {
	           se.printStackTrace();
	        }

	    } 
	 } 
}

