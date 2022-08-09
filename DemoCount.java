//(13).Program to count number of strings,integers and float values through command line arguments.

import java.lang.*;
class DemoCount
{
	public static void main(String[] args) {
		
		int chVal = 0,strVal = 0,iVal = 0,dVal = 0;
		
		for (int i=0;i<args.length;i++) 
		{
		   if(args[i].matches("[a-zA-Z]+"))
		   {
		   	if(args[i].length()==1)
		   	{
		   		chVal = chVal + 1;
		   	}
		   	else 
		   	{
		   		strVal =strVal + 1;
		   	}
		   }

		   if(args[i].matches("[0-9]+"))
		   {
		   	iVal = iVal +1;
		   }

		   if(args[i].matches("[+-]?\\d+\\.?(\\d+)?"))
		   {
		   	dVal = dVal + 1;
		   }	
		}
		dVal = dVal - iVal;

		System.out.println("Char Value : "+chVal);
		System.out.println("String Value : "+strVal);
		System.out.println("Int value : "+iVal);
		System.out.println("Double value : "+dVal);
	}
}
