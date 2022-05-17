package com.jobiak.java8;
interface MyInterface10
{
	public int leap(int n);
}
public class Main10 
{
	public static void main(String[] args)
	{
		MyInterface10 mi10=(int n)->{
			int result=0;
			if(n%4==0&&n%100!=0||n%400==0)
			{
				System.out.println("Leap year");
			}
			else
			{
				System.out.println("Not a leap year");
			}
			return result;
		};
		int result=mi10.leap(1900);
	}
}
