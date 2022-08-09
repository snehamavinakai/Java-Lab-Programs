//(9).Demonstrate multithreaded programming.

import java.lang.*;
class MultiThread extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=0;i<5;i++)
				{
					Thread.sleep(100);
					System.out.println("Current running Thread : "+Thread.currentThread()+""+i);
				}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class TestThread
{
	public static void main(String[] args) {
		MultiThread m1 = new MultiThread();
		MultiThread m2 = new MultiThread();
		m1.start();
		m2.start();
	}
}