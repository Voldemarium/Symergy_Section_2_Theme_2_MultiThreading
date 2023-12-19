package task_2;

public class TimerState {
    int counter = 0;
    boolean isRunning = true;

    void increment() {
        System.out.println(counter++);
    }
    void stopTimer() {
        isRunning = false;
    }
}
