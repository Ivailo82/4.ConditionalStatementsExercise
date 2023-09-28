package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double statistSuitPrice = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double totalSuitPrice = statist * statistSuitPrice;
        if (statist > 150) {
            totalSuitPrice = totalSuitPrice * 0.9;
        }
        double totalExpenses = decor + totalSuitPrice;
        double diff = Math.abs(budget - totalExpenses);
        if (budget >= totalExpenses) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
        else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }
    }
}
