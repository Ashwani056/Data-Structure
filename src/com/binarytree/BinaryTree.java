package com.binarytree;

import java.util.Scanner;

public class BinaryTree {
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	
	Node root=null;
	int size=0;
	
	public BinaryTree() {
		
		Scanner sc=new Scanner(System.in);
		this.root=takeInput(sc,null,false);
	}
	
	
	private Node takeInput(Scanner sc,Node parent,boolean isLeftOrRight)
	{
		if(parent==null)
		{
			System.out.println("Enter the data for root name ");
		}else {
			
			if(isLeftOrRight) {
				
				System.out.println("Enter the data for left child of "+parent.data);
				
			}else {
				System.out.println("Enter the data for right child of "+parent.data);
			}
			
		}
		
		int nodeData=sc.nextInt();
		Node node=new Node(nodeData,null,null);
		this.size++;
		
		boolean choice=false;
		System.out.println("Do you have left child of "+node.data);
		choice=sc.nextBoolean();
		
		if(choice==true)
		{
			node.left=takeInput(sc, node, true);
			
		}
		
		
		choice=false;
		System.out.println("Do you have right child of "+node.data);
		choice=sc.nextBoolean();
		
		if(choice==true)
		{
			node.right=takeInput(sc, node, false);
			
		}
		return node;
	}
	
	public void display()
	{
		this.display(this.root);
	}
	
	private void display(Node node)
	{
		String str="";
		if(node.left!=null) {
			str=str+node.left.data+"=>";
		}
		else {
			str=str+"END";
		}
		
		str=str+node.data;
		
		if(node.right!=null) {
			str=str+"<="+node.left.data;
		}
		else {
			str=str+"<=END";
		}
		
		System.out.println(str); 
		
		if(node.left!=null) {
			this.display(node.left);
		}
		if(node.right!=null)
		{
			this.display(node.right);
		}
		
	}
	
	public int height() {
		
		return this.height(this.root);
	}
	
	private int height(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		int lheight=this.height(node.left);
		int rheight=this.height(node.right);
		
		int height = Math.max(lheight, rheight)+1;
		return height;
	}

	public void preOrder()
	{
		this.preOrder(this.root);
	}
	
	private void preOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.println(node.data+",");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void InOrder()
	{
		this.preOrder(this.root);
		System.out.println("END");
	}
	
	private void InOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		
		preOrder(node.left);
		System.out.println(node.data+",");
		preOrder(node.right);
	}
}

