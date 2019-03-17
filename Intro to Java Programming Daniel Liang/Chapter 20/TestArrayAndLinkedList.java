package chapter20;

import java.util.*;

public class TestArrayAndLinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> arrayIntegerList = new ArrayList<>();
		
		arrayIntegerList.add(1);
		arrayIntegerList.add(2);
		arrayIntegerList.add(3);
		arrayIntegerList.add(1);
		arrayIntegerList.add(4);
		arrayIntegerList.add(0, 10);
		arrayIntegerList.add(3, 30);
		
		System.out.println("A list of integers in the array list: ");
		System.out.println(arrayIntegerList);
		System.out.println();
		
		// LinkedList object
		LinkedList<Object> linkedList = new LinkedList<>(arrayIntegerList);
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		
		System.out.println("Display the linked list forward: ");
		ListIterator<Object> javaListIterator = linkedList.listIterator();
		
		// while loop
		while(javaListIterator.hasNext()) {
			System.out.print(javaListIterator.next() + " ");
		}
		System.out.println("\n");
		
		System.out.println("Display the linked list backward: ");
		javaListIterator = linkedList.listIterator(linkedList.size());
		
		// while loop
		while(javaListIterator.hasPrevious()) {
			System.out.print(javaListIterator.previous() + " ");
		}
		
		
	}

}
