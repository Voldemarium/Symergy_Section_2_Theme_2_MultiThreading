package task_2;

import java.util.Scanner;

public class InputThread extends Thread {
    final TimerState state;

    InputThread(TimerState state) {
        this.state = state;
    }


    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter something to interrupt the thread");
            String s = scanner.nextLine();
            if (s != null) {
                state.stopTimer();
            }
    }
}
