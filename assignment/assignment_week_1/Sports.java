package assignment_week_1;
import java.util.Scanner;

public class Sports {
  long s_code;
  String s_name;
  int fees;
  int duration;

  public Sports() {
    s_code = 1001;
    s_name = "Cricket";
    fees = 500;
    duration = 70;
  }

  public void newSports() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter s_code: ");
    s_code = sc.nextLong();
    System.out.print("Enter s_name: (Table_Tennis, Swimming, Football): ");
    s_name = sc.next();
    System.out.print("Enter duration: ");
    duration = sc.nextInt();

    switch (s_name) {
      case "Table_Tennis":
        fees = 2000;
        break;
      case "Swimming":
        fees = 4000;
        break;
      case "Football":
        fees = 3000;
        break;
    }
  }

  public void displaySports() {
    System.out.println("s_code: " + s_code);
    System.out.println("s_name: " + s_name);
    System.out.println("fees: " + fees);
    System.out.println("duration: " + duration);
  }

  public static void main(String[] args) {
    Sports s = new Sports();
    s.newSports();
    s.displaySports();
  }
}

