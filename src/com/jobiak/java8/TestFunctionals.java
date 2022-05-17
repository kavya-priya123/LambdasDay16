package com.jobiak.java8;
import java.util.function.Function;
public class TestFunctionals {
     public static void main(String args[])
     {
    	 Function<String,Integer> lengthFunction=(String str)->{return str.length();};
    	 int result=lengthFunction.apply("Jobiak.com");
    	 System.out.println(result);
    	 //System.out.println("Jobiak.com".length());
     }
}
