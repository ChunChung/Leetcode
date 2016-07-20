package codeobjects;


public class RunnableJob implements Runnable{
	@Override
	public void run() {
		Thread thread = new Thread().currentThread();
		System.out.println("RunnableJob is being run by" + thread.getName() + "(" + thread.getId() + ")");
	}
}