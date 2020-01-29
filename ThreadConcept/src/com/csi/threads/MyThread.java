package com.csi.threads;

class MyThreadConcept extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("CSI PUNE");
		}
	}
}

class MyThreadConcept1 extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("CSI PUNE");
		}
	}
}
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadConcept t1=new MyThreadConcept();
		t1.start();
		//t1.start();   IllegalStateException

	}

}
