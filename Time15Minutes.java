package ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());
        minute = minute + 15;
        if (minute > 59) {
            hours = hours + 1;
            minute = minute % 60;

        }
        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minute);
    }
}
