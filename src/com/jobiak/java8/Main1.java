package com.jobiak.java8;
interface MyInterface1
{
	public int factors(int n);//abstract method declaration
}
public class Main1
{
	public static void main(String args[])
	{
		
		MyInterface1 mi1=(int n)->{
			int i;
				for(i=1;i<n;i++)
				{
					if(n%i==0)
					{
						System.out.println(i);
					}
				}
				return i;
		};
		int result=mi1.factors(35);
		System.out.println(result);
	}
}	

