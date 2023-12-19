package lesson_2;

public class MyThreadImplRun implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            counter++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("MyThreadImplRun = " + counter);
    }
}