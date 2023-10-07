package ConditionalStatementsExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int gpuCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double gpuPrice = gpuCount * 250;
        double cpuPrice = cpuCount * (gpuPrice * 0.35);
        double ramPrice = ramCount * (gpuPrice * 0.10);
        double totalPrice = gpuPrice + cpuPrice + ramPrice;
        if (gpuCount > cpuCount) {
            totalPrice = totalPrice * 0.85;
        }
        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
