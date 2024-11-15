package com.Programs;

import java.util.Scanner;

public class Exc3circumferance {
	public static double Circumference(int r)
	{
		double cir=3.14*r*r;
		return(cir);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	double cir=Circumference(r);
	System.out.println(cir);
	}

}
