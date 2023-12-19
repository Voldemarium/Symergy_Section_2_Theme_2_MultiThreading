package task_1;

public class NewThread extends Thread {
    NewThread(String name) {
        super(name);
    }

    NewThread() {
        super();
    }

    @Override
    public void run() {
        System.out.println("thread1 started");
        for (int i = 1; i <= 100; i++) {
            if (i == 100 || i == 50) {
                System.out.println("A");
            } else {
                System.out.print("A, ");
            }
        }
        System.out.println(" thread1 finished");
    }
}