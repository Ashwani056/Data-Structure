package com.linkedList;

public class LinkedList1 {
	
	private class Node{
		int date;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	
	public void display() {
		
		System.out.println("---------------------------------------");
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.date+",");
			temp=temp.next;
			
		}
		System.out.println(".");
		System.out.println("---------------------------------------");
	}
	
	public void addLast(int item)
	{
		//create a new node
		Node nn =new Node();
		nn.date=item;
		nn.next=null;
		
		//attach
		if(this.size>=1) {
			tail.next=nn;
		}
		
		//update summary object
		if(this.size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
			
		}else {
			this.tail =nn;
			this.size++;
			
		}
		
	}
	
	public void addFirst(int item)
	{
		//create node
		Node nn=new Node();
		nn.date=item;
		nn.next=null;
		
		if(this.size>=1)
		{
			nn.next=head;
		}
		if(this.size==0)
		{
			this.head=nn;
			this.tail=nn;
			this.size++;
			
		}else {
			this.head=nn;
			size++;
			
		}
		
	}
	
	private Node getNodeAt(int idx) throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("LL is empty");
		}
		if(idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		
		Node temp=this.head;
		for(int i=1;i<=idx;i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	
	public int getAt(int idx) throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("LL is empty");
		}
		if(idx<0||idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		Node temp=this.head;
		for(int i=1;i<idx;i++)
		{
			temp=temp.next;
		}
		return temp.date;
	}
	public int getFirst() throws Exception {
		
		if(this.size==0)
		{
			throw new Exception("LL is Empty");
		}
		return this.head.date;
	}
	
	public int getLast() throws Exception {
		
		if(this.size==0)
		{
			throw new Exception("LL is Empty");
		}
		return this.tail.date;
	}
	
	// O(1)
	public int removeFirst() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("LL is Empty");
		}
		
		int n=this.head.date;
		if(this.size==1)
		{
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
			this.head=this.head.next;
			this.size--;
		}
		
		return n;
		
	}
	
	public int removeLast() throws Exception
	{
		if(this.size==0)
		{
			throw new Exception("LL is Empty");
		}
		
		int n=this.tail.date;
		if(this.size==1)
		{
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
			Node sizem2=getNodeAt(this.size-2);
			this.tail=sizem2;
			this.tail.next=null;
			this.size--;
		}
		
		return n;
		
	}
	
	public int removeAt(int idx) throws Exception
	{
		if(idx<0 || idx>=this.size)
		{
			throw new Exception("Invalid Index");
		}
		if(this.size==0)
		{
			throw new Exception("LL is Empty");
		}
		if(idx==0) {
			return removeFirst();
		}
		else if(idx==this.size)
		{
			return 5;
		}
		return 0;
	}
	
	public void reverseData() throws Exception
	{
		int left=0;
		int right=this.size-1;
		while(left<right)
		{
			Node ln=getNodeAt(left);
			Node rn =getNodeAt(right);
			
			int temp=ln.date;
			ln.date=rn.date;
			rn.date=temp;
			
			left++;
			right--;
		}
	}
	
	public void reversePointer() {
		
		Node prev=this.head;
		Node curr=prev.next;
		
		while(curr!=null)
		{
			Node ahead=curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=ahead;
			System.out.println("hhh");
		}
		
		//swap
		Node t=this.head;
		this.head=this.tail;
		this.tail=t;
		
		this.tail.next=null;
		
	}
	
	public int mid()
	{
		Node slow=this.head;
		Node fast=this.head;
		
		//condition for odd and even nodes
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.date;
	}

}
