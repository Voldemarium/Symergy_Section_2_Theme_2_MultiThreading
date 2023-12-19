package lesson_1;

public class Lesson1_1 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        
        Thread myThread = new MyThread();
        myThread.setPriority(10); //10 - max приоритет потока (5 - по умолчанию)
        myThread.start(); //только метод start() вызыыает поток, run() вызовет только сам метод run(), но не поток

        //Можно присвоить имя потоку после его создания
        myThread.setName("myThread");
        
        Thread myThread2 = new MyThread("myThread2");
        myThread2.start();
        
        System.out.println(mainThread.getPriority());
        System.out.println(myThread.getPriority());
        
        try {
            Thread.sleep(500);   //сон 500мс
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(myThread2.getPriority());
    }
}