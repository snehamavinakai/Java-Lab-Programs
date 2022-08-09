//(8).Demonstrate concept of creating,accessing and using a package.

package mypack;
public class Addition
{
	public double a,b;
	public Addition(double a,double b)
	{
		this.a=a;
		this.b=b;
	}

	public double sum()
	{
		return (a+b);
	}
}


import mypack.Addition;
public class TestPack
{
	public static void main(String[] args) {
		Addition a=new Addition(10,20);
		System.out.println("Addition of two numbers = "+a.sum());
	}
}
