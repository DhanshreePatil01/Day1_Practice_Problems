package com.Bridgelabz;

import java.util.Scanner;

public class SumOfCommandLineArguments {

	public static void main(String[] args)
	{
		int count = 0;
			
		try 
			{
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			
			int sum=num1+num2;
			
			System.out.println("Sum of Command Line Arguments is :" + sum);
			}
			
			catch (NumberFormatException e) 
			{
			System.out.println("Invalid integer : " + e);
			count++;
			}
		
		
		System.out.println("Invalid integers count: "+count);
	}
}
	
