package task_2;

import java.util.Scanner;

public class Task_2_3 {

    public static void main(String[] args) {
// Cекундомер. Программа не останавливается, пока не будет осуществлен любой ввод в из консоли.
   // Вариант 2
        TimerState state = new TimerState();
        new TimerTrade(state).start();
        new InputThread(state).start();
    }
}
