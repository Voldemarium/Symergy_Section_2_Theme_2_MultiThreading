package lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        CommonResource resource = new CommonResource();

        for (int i = 1; i <= 6; i++) {
            Thread t = new MyThread(resource);
            t.setName("Thread " + i);
            t.start();
        }
    }
}
