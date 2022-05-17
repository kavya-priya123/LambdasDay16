package com.jobiak.java8;
interface MyInterface8
{
	public int arithmetic(int a,int b);
}
public class Main8 {
	public static void main(String[] args)
	{
		MyInterface8 mi8=(int a,int b)->{
		int c,d,e,f,g,result=0;
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		System.out.println("Sum="+c);
		System.out.println("Difference="+d);
		System.out.println("Multiplication="+e);
		System.out.println("Division="+f);//quotient
		System.out.println("Modulo Division="+g);//remainder  
		return result;
		};
		int result=mi8.arithmetic(20,10);
	}
}

