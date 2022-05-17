package com.jobiak.java8;
interface MyInterface2
{
   public int max(int num1,int num2);
}
public class Main2
{
	public static void main(String args[])
	{
		MyInterface2 mi2=(int num1,int num2)->{
			int result;
			if(num1>num2)
			{
				result=num1;
			}
			else
			{
				result=num2;
			}
			return result;
		};
	 int result=mi2.max(1,5);
	 System.out.println(result);
	}
}
  














