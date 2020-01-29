package com.csi.threads;

class ImplConcept implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("CSI PUNE");
	}
	
}
public class ThreadImplConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImplConcept i=new ImplConcept();
Thread t1=new Thread(i);
t1.start();
	}

}
