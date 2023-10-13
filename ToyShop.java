package ConditionalStatementsExercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzleCount * 2.60;
        double dollPrice = dollCount * 3.00;
        double bearPrice = bearCount * 4.10;
        double minionsPrice = minionsCount * 8.20;
        double truckPrice = truckCount * 2.00;
        int totalToyCount = puzzleCount + dollCount + bearCount + minionsCount + truckCount;
        double totalPrice = puzzlePrice + dollPrice + bearPrice + minionsPrice + truckPrice;

        if (totalToyCount >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        double rent = totalPrice * 0.1;
        double realMoney = totalPrice - rent;
        double diff = Math.abs(tripPrice - realMoney);
        if (tripPrice <= realMoney) {
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
