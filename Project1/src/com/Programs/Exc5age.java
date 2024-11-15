package com.Programs;

import java.util.Scanner;

public class Exc5age {
	public static boolean eligibile(int age)
	{
		if(age>18)
		{
			return true;
		}
		 
		else
		{
		 return false;
		}	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println(eligibile(age));
	}

}
