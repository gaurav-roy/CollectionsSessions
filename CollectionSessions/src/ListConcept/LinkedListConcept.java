package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:-to add ant String. The add() method is not mathematical addtition. Its just that we are adding any value so use add.
		
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print:
		System.out.println("Content of Linked List"+ ll);
		
		//addaFirst:
		ll.addFirst("Gaurav");
		
		
		//addLast:
		ll.addLast("Automation");
		System.out.println("Content of Linked List"+ ll);
		
		//get:to get the value.
		
		System.out.println(ll.get(0));
		
		//set: to set the value.
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove First and Last Element
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of Linked List"+ ll);
		
		
		//to remove from specific place
		ll.remove(2);
		System.out.println("Content of Linked List"+ ll);
		
		//how to print all the values of LinkedList:
		//1. using for loop
		System.out.println("using for loop");
		for(int n = 0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//2.using advance for loop
		System.out.println("using advance for loop");
		for(String str : ll) {//in advance for we need not define anything.
			System.out.println(str);
		}
		
		//3.using iterator
		System.out.println("using iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4. using while loop
		System.out.println("using while loop");
		int  num =0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
