package com.Programs;

import java.util.Scanner;

public class Factorial {
	public static void factorialp(int n)
	{
		int factorial=1;
		for(int i=n;i>=1;i--)
			factorial=factorial*i;
		
	}
	System.out.println(factorialp);
	return;
}
}

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factorialp(n);
		

	}

}
