package task_2;

public class TimerTrade extends Thread {
    final TimerState state;

    TimerTrade(TimerState state) {
        this.state = state;
    }

    @Override
    public void run() {
        try {
            while (state.isRunning) {
                state.increment();
                sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
