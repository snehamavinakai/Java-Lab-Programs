//(1).Display Fibonacci series up to n terms using command line arguments.

import java.lang.*;
class Fib
{
	public static void main(String[] args) {
		int fib1=0,fib2=1,fib3,n;
		n=Integer.parseInt(args[0]);
		System.out.println("Fibonacci Serier is : "+n);
		System.out.println(fib1+"\n"+fib2);
		for(int i=2;i<=n;i++)
		{
           fib3 = fib1 + fib2;
           System.out.println(""+fib3);
           fib1 = fib2;""
           fib2 = fib3;
		}
	}
}