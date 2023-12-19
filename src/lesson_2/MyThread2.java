package lesson_2;

public class MyThread2 extends Thread {
    int counter = 0;

    @Override
    public void run() {
        super.run();
        while (!isInterrupted()) {
           counter++;
        }
        System.out.println("MyThread2 = " + counter);
    }
}