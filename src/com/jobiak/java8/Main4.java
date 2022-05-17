package com.jobiak.java8;
interface MyInterface4
{
	public int sumOfDigits(int n);
}
public class Main4 {
	public static void main(String[] args) {
        MyInterface4 mi4=(int n)->{
        	int sum=0;
        	if(n>9)
        	{
        		while(n>0)
        		{
             		sum=sum+n%10;
               		n=n/10;
           		}
        	}
         return sum;
        };
        int sum=mi4.sumOfDigits(2345);
        System.out.println(sum);
	}
}
