
public class ChronometerThread implements Runnable {

	// we need thread object
	private Thread thread;

	// In order for threads to run, we need to be able to distinguish them apart. give a name every thread
	private String threadName;

	public ChronometerThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Thread is creating.." + threadName);
	}


	// The run method is the thread itself. 
	@Override
	public void run() {
		System.out.println("thread is running.." + threadName);
		
		
		// The code to be executed is written.could have written code or class written in another file
		try {
			for(int i=0 ; i<=10; i++) {
				System.out.println(threadName + " : " + i);
				Thread.sleep(1000); // yaz bir sn bekle
			}
		}catch(InterruptedException exception){ // interrupted exception: If a thread is somehow corrupted.
			System.out.println("thread is interrupted: " + threadName);
		}
		
		System.out.println("Thread is over: " + threadName);
		

	}
	
	
	public void start() {
		System.out.println("Thread object is creating");
		if(thread==null) {
			thread = new Thread(this, threadName); 
			thread.start();
		}
	}

}
