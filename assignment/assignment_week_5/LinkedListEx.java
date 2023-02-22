package assignment_week_5;

import java.util.*;

public class LinkedListEx{

    public static List<Object> descendingIterator(List<Object> listTwo) {

        List<Object> list2 = new LinkedList<>();

        for (int i = listTwo.size() - 1; i >= 0; i--) {

            list2.add(listTwo.get(i));
        }

        return list2;

    }
    public static List<Object> concatenateLists(List<Object> listOne, List<Object> listTwo) {

        List<Object> concatenated_list = new LinkedList<>();

        listOne.listIterator();
        
        concatenated_list.addAll(listOne);
        concatenated_list.addAll(descendingIterator(listTwo));

        return concatenated_list;
    }

    public static void main(String[] args) {
        List<Object> listOne = new LinkedList<Object>();
        listOne.add("Hello");
        listOne.add(102);
        listOne.add(25);
        listOne.add(38.5);
        List<Object> listTwo = new LinkedList<Object>();
        listTwo.add(150);
        listTwo.add(200);
        listTwo.add('A');
        listTwo.add("Welcome");
        List<Object> concatenatedList = concatenateLists(listOne, listTwo);

        System.out.println("Concatenated linked list:");

        for (Object value : concatenatedList) {
            System.out.print(value + " ");
        }
    }
}