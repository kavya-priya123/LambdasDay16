package com.jobiak.java8;
interface MyInterface6
{
	public int amstrong(int a);
}
public class Main6 
{
	public static void main(String[] args)
	{
       MyInterface6 mi6=(int a)->{
    	   int x,sum=0,p;
    	   p=a;
    	   while(a>0)
    	   {
    		   x=a%10;
    		   sum=sum+x*x*x;
    		   a=a/10;
    	   }     	  
    	   if(sum==p)
    	   {
    		   System.out.println("Amstrong number");
    	   }
    	   else
    	   {
    		   System.out.println("Not a amstrong number");
    	   }
     	   return sum;
       };   
       int sum=mi6.amstrong(143);
       System.out.println(sum);
	}

}
