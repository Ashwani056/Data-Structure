package com.binarytree;

public class Test {

	public static void main(String[] args) {

		BinaryTree tree=new BinaryTree();
		tree.display();
		System.out.println(tree.height());
		tree.preOrder();
		System.out.println("---------------------------------------");
		tree.InOrder();
	}

}


//50 true 25 true 38 false false true 48 true 18 false false true 45 true 85 false false true 60 false false