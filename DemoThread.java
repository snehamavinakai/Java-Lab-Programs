//(10).Write a program to implement thread priority.

class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
		System.out.println("i = "+i);
	    }
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=0;j<=3;j++)
		{
			System.out.println("j = "+j);
		}
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k=0;k<=3;k++)
		{
			System.out.println("k = "+k);
		}
	}
}

class DemoThread
{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		c.setPriority(5);
		b.setPriority(2);
		a.setPriority(4);
		a.start();
		b.start();
		c.start();
	}
}