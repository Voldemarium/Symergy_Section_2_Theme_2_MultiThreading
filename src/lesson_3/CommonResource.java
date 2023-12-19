package lesson_3;

public class CommonResource {
    int x = 0;

    synchronized void increment() {
        this.x = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - "  + this.x);
            this.x++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
