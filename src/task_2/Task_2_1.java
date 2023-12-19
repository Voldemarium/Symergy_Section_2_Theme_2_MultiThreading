package task_2;

import java.util.Scanner;

public class Task_2_1 {
    static String str;
    static boolean monitorState = false;

    public static void main(String[] args) {
// Напишите программу, которая сможет в одном потоке читать данные из консоли, а в другом будет их выводить
        Thread threadIn = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter something for interrupt thread");
                str = scanner.nextLine();
                    monitorState = true;
            }
        }, "threadIn");
        threadIn.start();

        Thread threadOut = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                        if (monitorState) {
                            System.out.println(str);
                            monitorState = false;
                        }
                }
        }, "threadOut");
        threadOut.start();
    }
}
