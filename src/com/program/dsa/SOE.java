package com.program.dsa;

import java.util.Arrays;

public class SOE {

	public static void main(String[] args) {

		SOEAlgo(25);
	}
	
	public static void SOEAlgo(int n)
	{
		boolean[] primes = new boolean[n+1];
		Arrays.fill(primes, true);
		
		primes[0] = primes[1]=false;
		
		for(int i=2;i*i<=n;i++)
		{
			if(primes[i]==false)
			{
				continue;
			}
			for(int mult=2 ;i*mult<=n ; mult++)
			{
				primes[i*mult]=false;
			}
		
		}
		
		for(int i=2;i<primes.length;i++)
		{
		
			if(primes[i]==true)
			{
				System.out.println("prime numbers are = "+i);
			}
			
		}
	}

}
