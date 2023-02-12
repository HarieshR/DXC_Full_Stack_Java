package assignment_week_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchRecord {

	   private static final String url = "jdbc:mysql:///Books";
	   private static final String user = "root";
	   private static final String password = "159951";

		 public void search() {

		     Scanner sc = null;
		     int n = 0;
		     int bookId = 0;
		     String bookName = null;
		     Connection con = null;

		     try {
		        sc = new Scanner(System.in);
		        if(sc != null) {
		            System.out.print("Enter Number of Books you want to search: ");
		            n = sc.nextInt();
		        }
		        con = DriverManager.getConnection(url, user, password);
			    Statement st = con.createStatement();
		        
		        if(sc != null) {
		           for(int i=0; i<n; i++) {
		        	  System.out.println("Enter Book Id or Book Name");
		              System.out.print("bookId: ");
		              bookId = sc.nextInt();
		              System.out.print("bookName: ");
		              bookName = sc.nextLine();
		              bookName+=sc.nextLine();
		              
		    	      String query = "SELECT * FROM bookDetails WHERE bookId = '" + bookId +
                    "' OR bookName = '" + bookName + "'";

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
		           }
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
		        try {
		           if(sc != null) sc.close();
		        } catch(Exception e) {
		           e.printStackTrace();
		        }
		     } 
		   } 
	}

