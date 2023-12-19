package task_2;

import java.util.Scanner;

public class Task_2_2 {

    public static void main(String[] args) {
// Cекундомер. Программа не останавливается, пока не будет осуществлен любой ввод в из консоли.
    // Вариант 1
        Thread timerThread = new Thread(() -> {
             int i = 0;
             while (!Thread.currentThread().isInterrupted()) {
                 System.out.println(i++);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     Thread.currentThread().interrupt();
                 }
             }
         }, "thread1");
        timerThread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something to interrupt the thread");
        scanner.nextLine();
        timerThread.interrupt();
    }
}
