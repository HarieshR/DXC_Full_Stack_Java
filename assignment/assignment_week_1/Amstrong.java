package assignment_week_1;

import java.util.Scanner;

public class Amstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        boolean isArmstrong = checkArmstrong(n);
        if (isArmstrong) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    public static boolean checkArmstrong(int n) {
        int t = n;
        int result = 0;
        int digits = 0;
        while (t != 0) {
            digits++;
            t /= 10;
        }
        t = n;
        while (t != 0) {
            int r = t % 10;
            result += Math.pow(r, digits);
            t /= 10;
        }
        return result == n;
    }
}



