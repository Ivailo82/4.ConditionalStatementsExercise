package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForMeter = Double.parseDouble(scanner.nextLine());
        double timeToSwim = distanceInMeter * timeInSecondsForMeter;
        double slowDistance = Math.floor(distanceInMeter / 15);
        double slowTime = slowDistance * 12.5;
        double totalTimeToSwim = timeToSwim + slowTime;
        if (totalTimeToSwim < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeToSwim);
        }
        else {
            double neededTime = totalTimeToSwim - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededTime);
        }
    }
}
