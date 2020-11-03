package com.program.dsa;

public class StackUsingArray {
	
	private int[] data;
	private int top;
	
	public static final int DEFAULT_CAPACITY=20;
	
	public StackUsingArray() throws Exception {
		this(DEFAULT_CAPACITY);
	}
	
	public StackUsingArray(int capacity) throws Exception
	{
		if(capacity<1)
		{
			throw new Exception("Invalid Capacit");
			
		}
		
		this.data=new int[capacity];
		this.top=-1;
		
	}
	
	public int size()
	{
		return this.top+1;
	}
	
	public boolean isEmpty()
	{
		return this.size()==0;
	}
	
	public void push(int value) throws Exception{
		if(this.size()==this.data.length) {
			throw new Exception("Stack is full");
		}
		
		this.top++;
		this.data[this.top]=value;
	}
	
	public int pop() throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("Stack is Empty");
		}
		
		int rv=this.data[this.top];
		this.data[this.top]=0;
		this.top--;
		return rv;
	}
	
	public int top() throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("Stack is Empty");
		}
		
		int rv=this.data[this.top];
		return rv;
	}
	
	public void display()
	{
		for(int i=this.top;i>=0;i--)
		{
			System.out.println(this.data[i] + " ");
		}
		System.out.println("END");
	}

}
