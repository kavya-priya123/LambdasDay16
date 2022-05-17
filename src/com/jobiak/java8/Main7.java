package com.jobiak.java8;
interface MyInterface7
{
	public int perfect(int n);
}
public class Main7 
{
	public static void main(String[] args)
	{
		MyInterface7 mi7=(int n)->{
			int i,sum=0;
			for(i=1;i<n;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			System.out.println(sum);
			if(sum==n)
			{
				System.out.println("Perfect number");
			}
			else
			{
				System.out.println("Not a Perfect number");
			}
			return sum;
		};
		int sum=mi7.perfect(5);
		//System.out.println(sum);
	}
}
