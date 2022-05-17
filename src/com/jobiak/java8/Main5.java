package com.jobiak.java8;
interface MyInterface5
{
	public int mulOfDigits(int n);
}
public class Main5 {
	public static void main(String[] args) {
        MyInterface5 mi5=(int n)->{
        	int mul=1,x;
        	if(n>9)
        	{
        		while(n>0)
        		{
        			x=n%10;
             		mul=mul*x;
               		n=n/10;
           		}
        	}
         return mul;
        };
        int mul=mi5.mulOfDigits(283);
        System.out.println(mul);
	}
}