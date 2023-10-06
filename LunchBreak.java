package ConditionalStatementsExercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int serialTime = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());
        double timeForLunch = 1.0 *lunchBreak / 8;
        double timeForRest = 1.0 * lunchBreak / 4;
        double passedTime = timeForLunch + timeForRest;
        double remainingTime = lunchBreak - passedTime;
        double diff = Math.abs(serialTime - remainingTime);
        if (serialTime <= remainingTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(diff));
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName,Math.ceil(diff));
        }

    }
}
