public class CustomThread extends Thread {

//	@Override
	public void run() {
        System.out.println("Custom Thread is running");

		for (int i = 1; i <= 5; i++) {
			System.out.print(" 1 ");
			try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}
