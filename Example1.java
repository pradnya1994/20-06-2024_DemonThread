package javaDeamonThreads;

public class Example1 implements Runnable
{

	@Override
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Yes "+Thread.currentThread());;
		}
		else
		{
			System.out.println("No "+Thread.currentThread());
		}
	}
}
