package com.jobiak.java8;
interface MyInterface9
{
	public int prime(int n);
}
public class Main9 {
	public static void main(String[] args) 
	{
		MyInterface9 mi9=(int n)->{
          int i,count=0,result=0;
          for(i=2;i<n;i++)
          {
        	if(n%i==0)
        	{
        		count++;
        	}
          }
          if(count==0)
          {
        	  System.out.println("Prime number");
          }
          else
          {
        	  System.out.println("Not a Prime number");
          }
          return result;
		};
		int result=mi9.prime(8);
	}
}
