package com.chainsys.garbageCollections;

public class FinalizeDemo
{
	public static void main(String args[])throws Exception
	{
		Calculator c1=new Calculator();
		c1.add(100,50);
		c1=null;
		Calculator c2=new Calculator();
		Calculator c3=new Calculator();
		//creating an object for runtime
		//It is not possible to create an object directly for runtime like 
		//Runtime firstRt=new Runtime();
		//The default constructor for Runtime is private here.
		//So we use a static method getRuntime() of the Runtime class to create
		//an object for Runtime
		Runtime rt=Runtime.getRuntime();//factorymethod
	    rt.gc();		//forcing garbage collection
	    c2=null;
	    c3=null;
	    rt.gc();
		System.in.read();
	}
}
