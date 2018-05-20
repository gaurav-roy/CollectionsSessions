package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		// dynamic array---ArrayList:
		// 1.can contain duplicate values/elements
		// 2.Maintain Insertion order
		// 3.Synchronized
		// 4.allows random access to fetch the element because it stores the values on
		// the basis of indexes

		ArrayList ar = new ArrayList();

		ar.add(10);// 0
		ar.add(20);// 1
		ar.add(30);// 2

		System.out.println(ar.size());
		ar.add(40);// 3
		ar.add(50);// 4
		ar.add(50);// 5
		ar.add("Tom");// 6
		ar.add("Hello");// 7
		ar.add(12.33);// 8
		ar.add('M');// 9

		System.out.println(ar.size());// size of ArrayList

		System.out.println(ar.get(4));// to get value from index

		// to print all the values of ArrayList:
		// 1. for loop
		// 2. using iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// generic and non-generic

		// Generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Sel");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");

		// Employee class object
		Employee e1 = new Employee("Gaurav", 23, "QA");
		Employee e2 = new Employee("Tom", 24, "Admin");
		Employee e3 = new Employee("Peter", 25, "Dev");

		// create ArrayList:
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);

		// iterator to traverse the value
		Iterator<Employee> it = ar3.iterator();
		while (it.hasNext()) { // for iterator we use while loop
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}
		System.out.println("*************");

		// addAll Method-- to merge two ArrayList

		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Tom");
		ar4.add("Test");
		ar4.add("Selenium");

		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Peter");
		ar5.add("Testing");
		ar5.add("QTp");

		ar4.addAll(ar5);

		for (int i = 0; i < ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}
		System.out.println("*******************************");
		
		//removeAll method:
		ar4.removeAll(ar5);
		for (int i = 0; i < ar4.size(); i++) {
			System.out.println(ar4.get(i));
		}
		System.out.println("*******************************");
		
		//retainAll():VVI- it helps us to find the common values in the array list between two arraylist
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Hello");
		ar6.add("World");
		ar6.add("Of Selenium");

		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Hello");
		ar7.add("Tom");
		
		ar6.retainAll(ar7);
		for(int i = 0; i<ar6.size(); i++) {
			System.out.println(ar6.get(i));
		}
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
