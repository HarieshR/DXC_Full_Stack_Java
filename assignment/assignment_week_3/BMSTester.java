/*
  Book Management System
 
  1. Add New Book 
  2. Delete Book 
  3. Update Book 
  4. Search Book 
  5. Show Book
  6.Exit 
  
  enter your choice : 1
 
  Welcome to BMS 
  
  enter book id : 1
  Enter Book Name : introduction Java
  Author Name : Daniel liang
  Edition : 9th
  
  enter your choice : 4
  enter bookid  to search :
  enter Name  to search :  
*/
package assignment_week_3;
import java.util.Scanner;
public class BMSTester {

	public static void main(String[] args) throws Exception{
		
		System.out.println("Welcome to Book Management System");
		System.out.println("  1. Add New Book \r\n"
				+ "  2. Delete Book \r\n"
				+ "  3. Update Book \r\n"
				+ "  4. Search Book \r\n"
				+ "  5. Show Book\r\n"
				+ "  6. Exit ");
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		InsertRecord i = new InsertRecord();
		DeleteRecord d = new DeleteRecord();
		UpdateRecord u = new UpdateRecord();
		SearchRecord s = new SearchRecord();
		ShowRecord h = new ShowRecord();
		switch (n) {
		case 1:
			i.insert();
			break;
		case 2:
			d.delete();
			break;
		case 3:
			u.update();
			break;
		case 4:
			s.search();
			break;
		case 5:
			h.show();
			break;
		case 6:
			break;
	
		}
	}
}
