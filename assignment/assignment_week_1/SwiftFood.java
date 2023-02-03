package assignment_week_1;
import java.util.Scanner;

class Order {
    int orderId;
    String orderedFoods;
    double totalPrice;
    String status;

    public Order() {
        this.status = "Ordered";
    }

    public Order(int orderId, String orderedFoods) {
        this.orderId = orderId;
        this.orderedFoods = orderedFoods;
        this.status = "Ordered";
    }

    public double calculateTotalPrice(int unitPrice) {
        totalPrice = unitPrice * 0.05;
        return totalPrice;
    }
}
public class SwiftFood {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println("Order 1 status: " + o1.status);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter food ID: ");
//        int id = sc.nextInt();
//        System.out.println("Enter the name of food: ");
//        String food = sc.next();
        int id = 1234;
        String food = "Noodles";
        Order o2 = new Order(id, food);
        System.out.println("Order 2 status: " + o2.status);
        System.out.println("Order ID: " + o2.orderId);
        System.out.println("Ordered Food: " + o2.orderedFoods);
        
    }
}
