package com.Programs;

import java.util.Scanner;

public class Factorial2 {
	public static void printfactorial(int n)
	{
		int factorial=1;
		for(int i=1;i<=n;i++)
		{
		factorial=factorial*i;
		}
		System.out.print(factorial);
		return;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printfactorial(n);
	}

}
