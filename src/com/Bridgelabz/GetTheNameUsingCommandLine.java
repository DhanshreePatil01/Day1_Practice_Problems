package com.Bridgelabz;

import java.util.Scanner;

public class GetTheNameUsingCommandLine {

	public static void main(String[] args) {
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Give the name: ");
		str=sc.nextLine();
		
		System.out.println("Entered Name is: "+str);
	}
}
