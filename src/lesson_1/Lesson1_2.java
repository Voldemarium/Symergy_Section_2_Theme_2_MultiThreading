package lesson_1;

import java.util.ArrayList;

public class Lesson1_2 {
    public static void main(String[] args) {
        System.out.println("mainThread started");
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread" + i + " started???");
            Thread t = new MyThread("myThread" + i);
            t.start();
            threads.add(t);

            try {
                Thread.sleep(300);   //сон 300мс
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //метод isAlive() - проверка выполняется ли в данный момент поток
        for (Thread t : threads) {
            System.out.println(t.getName() + ": " + t.isAlive());
        }

        //метод join() - поток не будет выполнятся далее, пока не закончит работу main
        for (Thread t : threads) {
            try {
                t.join();   //задержка потока до выполнения всех следующих команд в main
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("mainThread finished");

        //Создание потока с классом, имплементирующим Runnable
        Thread threadR = new Thread(new MyThreadImplRun(), "ThreadR");
        threadR.start();

        //Создание потока с лямбдой, реализующей Runnable
        Thread threadLambda = new Thread(() -> {
            System.out.println("this is ThreadLambda");
        }, "ThreadLambda");
        threadLambda.start();
    }
}