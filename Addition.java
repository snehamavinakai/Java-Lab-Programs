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