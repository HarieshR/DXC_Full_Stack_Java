package assignment_week_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

	public class InsertRecord {

	   private static final String url = "jdbc:mysql:///Books";
	   private static final String user = "root";
	   private static final String password = "159951";
	   private static final String INSERT_Books_QUERY = "INSERT INTO bookDetails VALUES (?,?,?,?)";
  
	   public void insert() {

			 Scanner scan = null;
			 int n = 0;
			 int bookId = 0;
			 String bookName = null;
			 String authorName = null;
			 String edition = null;
			 Connection con = null;
			 PreparedStatement ps = null;
			 int result = 0;

		     try {
		        scan = new Scanner(System.in);

		        if(scan != null) {
		            System.out.print("Enter Number of Books: ");
		            n = scan.nextInt();
		        }
		        con = DriverManager.getConnection(url, user, password);

		        if(con != null) {
		           ps = con.prepareStatement(INSERT_Books_QUERY);
		        }
		        
		        if(scan != null && ps != null) {
		           for(int i=0; i<n; i++) {

		              System.out.println("\nEnter Book "+(i+1)+" details,");
		              System.out.print("bookId: ");
		              bookId = scan.nextInt();
		              System.out.print("bookName: ");
		              bookName = scan.nextLine();
		              bookName+=scan.nextLine();
		              System.out.print("authorName: ");
		              authorName = scan.nextLine();
		              authorName+=scan.nextLine();
		              System.out.print("edition: ");
		              edition = scan.nextLine();
		              edition+=scan.nextLine();

		              ps.setInt(1, bookId);
		              ps.setString(2, bookName);
		              ps.setString(3, authorName);
		              ps.setString(4, edition);

		              result = ps.executeUpdate();
		           }
		        }
		        
		        if(result == 0) {
		           System.out.println("\nRecords insertion failed");
		        } else {
		           System.out.println("\nRecords inserted successfully.");
		        }

		     } catch(SQLException se) {
		        se.printStackTrace();
		     } catch(Exception e) {
		        e.printStackTrace();
		     } 

		     finally {

		        try {
		           if(ps != null) ps.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(con != null) con.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(scan != null) scan.close();
		        } catch(Exception e) {
		           e.printStackTrace();
		        }
		     } 
		   } 
	}

