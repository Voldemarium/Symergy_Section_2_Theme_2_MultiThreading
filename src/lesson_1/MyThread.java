package lesson_1;

public class MyThread extends Thread {
    //При желании потоку можно задать свое имя
    MyThread(String name) {
        super(name);
    }
    
    MyThread() {
        super();
    }
    
    @Override
    public void run() {
//        super.run();
         System.out.println(getName() + " started");
        try {
            Thread.sleep(500);   //сон 500мс
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " finished");
    }
}