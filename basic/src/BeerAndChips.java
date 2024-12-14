import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fanName = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerQuantity = Integer.parseInt(scanner.nextLine());
        int chipsPacks = Integer.parseInt(scanner.nextLine());


        double beerPrice = 1.20;
        double chipsPricePercentage = 0.45;

        int totalChipsPrice = (int) Math.ceil(chipsPacks * (beerPrice * beerQuantity) * chipsPricePercentage);

        double totalSnackPrice = beerPrice * beerQuantity + totalChipsPrice;

        if (budget >= totalSnackPrice) {
            double remainingMoney = budget - totalSnackPrice;
            System.out.printf("%s bought a snack and has %.2f leva left.%n", fanName, remainingMoney);
        } else {
            double neededMoney = totalSnackPrice - budget;
            System.out.printf("%s needs %.2f more leva!%n", fanName, neededMoney);
        }
    }
}

