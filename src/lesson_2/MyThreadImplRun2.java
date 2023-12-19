package lesson_2;

public class MyThreadImplRun2 implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                counter++;
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("MyThreadImplRun = "+counter);
    }
}