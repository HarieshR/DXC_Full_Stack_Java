/*Define a class called Library with the following description :
Instance variables/data members :
int acc_num — stores the accession number of the book
String title — stores the title of the book
String author — stores the name of the author
Member methods:
(i) void input ( ) — To input and store the accession number, title and author.
(ii) void compute ( ) — To accept the number of days late, 
calculate the display the fine charged at the rate of Rs. 2 per day.
(iii) void display( ) — To display the details in the following format:
Accession      Number      Title Author
Write a main method to create an object of the class and call the above member methods

*/

package assignment_week_1;
import java.util.Scanner;

class Details {
    int acc_num;
    String title;
    String author;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter accession number: ");
        acc_num = sc.nextInt();
        System.out.print("Enter title: ");
        title = sc.next();
        System.out.print("Enter author: ");
        author = sc.next();
    }

    void compute(int daysLate) {
    	if(daysLate!=0)
    	{
        int fine = daysLate * 2;
        System.out.println("\nFine charged: Rs. " + fine);
    	}
    	else
        System.out.println("You dont have any fine amount");		
    }

    void display() {
        System.out.println("Accession Number: " + acc_num);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Library {
    public static void main(String[] args) {
        Details book = new Details();
        book.input();
        System.out.print("Enter number of days late: ");
        Scanner sc = new Scanner(System.in);
        int daysLate = sc.nextInt();
        book.compute(daysLate);
        book.display();
    }
}