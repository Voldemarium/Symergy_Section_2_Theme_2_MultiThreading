package lesson_1;

public class MyThreadImplRun implements Runnable {
    
    @Override
    public void run() {
         System.out.println("MyThreadR started");
        try {
            Thread.sleep(500);   //сон 500мс
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThreadR finished");
    }
}