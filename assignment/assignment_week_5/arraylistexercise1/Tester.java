//lex_auth_0129556406194913281196
//do not modify the above line

package assignment_week_5.arraylistexercise1;

import java.util.List;
import java.util.ArrayList;

public class Tester {
    
    public static List<String> getItems(List<Order> orders) {
		List<String> itemList=new ArrayList<>();
		for(Order order:orders) 
			itemList.addAll(order.getItemNames());
		return itemList;
	}
    
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<Order>();

		List<String> items1 = new ArrayList<String>();
		items1.add("FriedRice");
		items1.add("Pasta");
		items1.add("Tortilla");
		orders.add(new Order(101, items1, true));

		List<String> items2 = new ArrayList<String>();
		items2.add("Pizza");
		items2.add("Pasta");
		orders.add(new Order(102, items2, true));

		List<String> items3 = new ArrayList<String>();
		items3.add("Burger");
		items3.add("Sandwich");
		items3.add("Pizza");
		orders.add(new Order(103, items3, true));

		List<String> items = getItems(orders);
		System.out.println("List of Items:");
		for (String item : items) {
			System.out.println(item);
		}

	}

}
