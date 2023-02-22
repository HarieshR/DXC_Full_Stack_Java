//package assignment_week_5;
//
//import java.util.List;
//import java.util.ArrayList;
//
//class Orderlist {
//	private int orderId;
//	private List<String> itemNames;
//	private boolean cashonDeleivery;
//	Orderlist(int orderId,List<String> itemNames,boolean cashonDeleivery) {
//		this.orderId=orderId;
//		this.itemNames=itemNames;
//		this.cashonDeleivery=cashonDeleivery;
//	}
//	public int getorderId() {
//		return orderId;
//	}
//	public void setorderId(int orderId) {
//		this.orderId=orderId;
//	}
//	public List<String> getitemNames() {
//		return itemNames;
//	}
//	public void setitemNames(List<String> itemNames) {
//		this.itemNames=itemNames;
//	}
//	public boolean iscashonDeleivery() {
//		return cashonDeleivery;
//	}
//	public void setcashonDeleivery(boolean cashonDeleivery) {
//		this.cashonDeleivery=cashonDeleivery;
//	}
//	@Override
//	public String toString() {
//		return "Order Id: "+getorderId()+", Item Names: "+getitemNames()+", Cash On Deleivery: "+iscashonDeleivery();
//	}
//
//}
//public class ArrayListEx{
//	public static List<String> getItems(List<Orderlist> orders){
//		List<String> itemList=new ArrayList<>();
//		for(Orderlist order:orders) 
//			itemList.addAll(order.getitemNames());
//		return itemList;
//		
//	}
//	public static void main(String args[]) {
//		List<Orderlist> orders=new ArrayList<Orderlist>();
//		List<String> items1=new ArrayList<String>();
//		items1.add("FriedRice");
//		items1.add("Pasta");
//		items1.add("Tortilla");
//		orders.add(new Orderlist (101,items1,true));
//		
//		List<String> items2=new ArrayList<String>();
//		items2.add("Pizza");
//		items2.add("Pasta");
//	    orders.add(new Orderlist (102,items2,true));
//	    
//	    List<String> items3=new ArrayList<String>();
//		items3.add("Burger");
//		items3.add("Sandwich");
//		items3.add("Pizza");
//		orders.add(new Orderlist (103,items3,true));
//		
//		List<String> items=getItems(orders);
//		for(String item:items) {
//			System.out.println(item);
//		}System.out.println();
//		
//		
//	}
//}