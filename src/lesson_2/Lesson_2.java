package lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread.stopCounter();
        //---------------------------------------------------------
        Thread myThread2 = new MyThread2();
        myThread2.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread2.interrupt();  // метод переводит флаг boolean isInterrupted в состояние true
        //---------------------------------------------------------
        Thread myThread3 = new Thread(new MyThreadImplRun());
        myThread3.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread3.interrupt();  // метод переводит флаг boolean isInterrupted в состояние true

    }
}
