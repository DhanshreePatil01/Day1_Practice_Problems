package com.Bridgelabz;

public class DemonstrateStaticVariableMethodBlock {

static int num1=10;                //static variable
static int num2=5;

static void print()                //static method
{
	System.out.println("Static Method");
	System.out.println("num1= "+num1);
	System.out.println("num2= "+num2);
}

static                               //static block
{
	System.out.println("Static Block");
}
public static void main(String[] args) {
	
	DemonstrateStaticVariableMethodBlock.print();
	
}
}
