package com.linkedList;

public class Client {
	
	
	public static void main(String[] args) throws Exception {
		LinkedList1 list = new LinkedList1();
		
		list.addLast(20);
		list.addLast(30);
		list.addFirst(40);
		list.addFirst(50);
		list.addFirst(10);
		list.addFirst(1);
		list.addLast(80);
		list.removeFirst();
		list.display();
		list.reverseData();
		list.display();
		list.reversePointer();
		list.display();
		
		System.out.println(list.mid());
	}

}
