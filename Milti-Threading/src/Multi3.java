
public class Multi3 implements Runnable {
public void run()
{
	System.out.println("Thread is Running....");
}
	public static void main(String[] args) {
		Multi3 m = new Multi3();
		Thread t1 = new Thread(m);
		t1.start();
	}

}
