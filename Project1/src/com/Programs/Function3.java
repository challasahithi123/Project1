package com.Programs;

import java.util.Scanner;

public class Function3 {
	public static void printfactorial(int n)
	{
		/*if(n<0)
		{
			System.out.println("invalid");
			return;
		}*/
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
			}
		System.out.println(factorial);
		return;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printfactorial(n);
	}

}

