package task_1;

public class NewThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("thread2 started");
        for (int i = 101; i <= 200; i++) {
            if (i == 150 || i == 200) {
                System.out.println("B");
            } else {
                System.out.print("B, ");
            }
        }
        System.out.println(" thread2 finished");
    }
}