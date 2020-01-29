package com.csi.threads;

class T1 extends Thread
{
 public void run()
 {
	 System.out.println("Thread T1");
 }
}
class T2 extends Thread
{
	public void run() 
	{
		System.out.println("Thread T2");
	}
	
}
class T3 extends Thread
{
	public void run()
	{
		System.out.println("Thread T3");
	}
}
public class ThreadEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 t1=new T1();
		T2 t2=new T2();
		T3 t3=new T3();
		t1.start();
		try {
			t1.join(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t1.join();
		
		t2.join();
		t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ALL threads dead existing main thread...");
	}

}
