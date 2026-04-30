package demo;

public class MyThread2 extends Thread {

    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}