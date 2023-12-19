package lesson_2;

public class MyThread extends Thread {
    int counter = 0;
    boolean isLive = true;

    public void stopCounter() {
        isLive = false;
    }

    @Override
    public void run() {
        super.run();
        while (isLive) {
           counter++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
     //       System.out.println(counter);
        }
        System.out.println("MyThread = " + counter);

    }
}