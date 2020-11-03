package com.program.dsa;

public class StackUsingArrayClinet {
	public static void main(String[] args) throws Exception {
		StackUsingArray stack=new StackUsingArray(5);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.pop();
		System.out.println(stack.top());
		//stack.display();
	}

}
