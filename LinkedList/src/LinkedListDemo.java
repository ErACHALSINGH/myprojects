import java.io.*;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>linkedlist = new LinkedList<String>();
        linkedlist.add("item1");
        linkedlist.add("item5");
        linkedlist.add("item3");
        linkedlist.add("item6");
        linkedlist.add("item2");
        System.out.println("Linked List Content:" +linkedlist);
        linkedlist.addFirst("1st iteam");
        linkedlist.addLast("Last iteam");
        System.out.println("Linked List Content: "+linkedlist);
        System.out.println("First Element is: "+linkedlist.get(0));
        linkedlist.set(0, "Changed first iteam");
        System.out.println("First Element after updated by set method:"+linkedlist.get(0));
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("linked list after deletion of first and last element:"+linkedlist);
        linkedlist.add(0,"new item");
        linkedlist.remove(2);
        System.out.println("Final Content:"+linkedlist );
        
	}

}
