package miit;

public class Thread_ex extends Thread {
	
	public void run() {
		System.out.println("Thread is started running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_ex t1 = new Thread_ex();
		t1.start();

	}

}
