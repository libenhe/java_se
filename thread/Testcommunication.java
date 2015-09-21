package thread;
//ͨ线程通信
class Testcommunication implements Runnable {

	int num = 1;

	@Override
	public void run() {

		while (true) {
			synchronized (this) {
				notify();
				if (num <= 100) {
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					 System.out.println(Thread.currentThread().getName() + ":" + num++);
				} else {
					break;
				}
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		Testcommunication testcommunication = new Testcommunication();
		Thread t1 = new Thread(testcommunication);
		Thread t2 = new Thread(testcommunication);

		t1.setName("甲");
		t2.setName("乙");

		t1.start();
		t2.start();
	}
}
