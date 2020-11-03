package com.backtracking;

public class OneDQueenPermutation {
	static int  count=0;
	
	public static void main(String[] args) {
		
		QueenPermutation(new boolean[4], 0, 2,"");
	}
	
	public static void QueenPermutation(boolean[] board,int qpsf,int tq,String ans)
	{
		if(qpsf==tq)
		{
			count++;
			System.out.println(count + " . "+ans);
			return;
		}
		for(int i=0;i<board.length;i++)
		{
			if(board[i]==false)
			{
				board[i]=true;
				QueenPermutation(board, qpsf+1, tq, ans + "q"+ qpsf+ "b" +i);
				board[i]=false; ///undo changes
			}
			 
		}
	}

}
