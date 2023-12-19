package task_1;

public class Task_1 {
    public static void main(String[] args) {
        Thread thread1 = new NewThread("thread1");
        thread1.start();

        Thread thread2 = new Thread(new NewThreadRunnable(),
                "thread2");
        thread2.start();

        Thread thread3 = new Thread(() -> {
            System.out.println("thread3 started");
            for (int i = 201; i <= 300; i++) {
                if (i == 250 || i == 300) {
                    System.out.println("C");
                } else {
                    System.out.print("C, ");
                }
            }
            System.out.println(" thread3 finished");
        }, "thread3");
        thread3.start();
    }
}
