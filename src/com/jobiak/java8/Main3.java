package com.jobiak.java8;
interface MyInterface3
{
		public int revNum(int n);
}
public class Main3 
{
	public static void main(String[] args) 
	{		
		MyInterface3 mi3=(int n)->{
			int rev=0;
		if(n>9)
		{
			while(n>0)
			{
		      rev=rev*10+n%10;
       		  n=n/10;
			}
		}
		else
		{
			System.out.println("Enter a multidigit number");
		}
	    return rev;
	};
	int rev=mi3.revNum(125);
	System.out.println(rev);
		
	}
}
