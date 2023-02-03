package assignment_week_1;
import java.util.Scanner;

public class IncomeTax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter age: ");
    int age = sc.nextInt();
    System.out.print("Enter gender (male/female): ");
    String gender = sc.next();
    System.out.print("Enter Taxable Income in Rs.: ");
    int ti = sc.nextInt();

    if (age > 65 || (gender=="female"|| gender=="Female")) {
      System.out.println("Wrong category");
      return;
    }

    int tax = 0;
    if (ti <= 160000) {
      tax = 0;
    } else if (ti > 160000 && ti <= 500000) {
      tax = (ti - 160000) * 10 / 100;
    } else if (ti > 500000 && ti <= 800000) {
      tax = (ti - 500000) * 20 / 100 + 34000;
    } else {
      tax = (ti - 800000) * 30 / 100 + 94000;
    }

    System.out.println("Income Tax payable: " + tax + " Rs.");
  }
}
