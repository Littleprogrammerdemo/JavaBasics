import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int tracks = Integer.parseInt(scanner.nextLine());
        double numOfToys = puzzles + dolls + bears + minions + tracks;

        double priceForPuzzles = puzzles * 2.60;
        double priceForDolls = dolls * 3;
        double priceForBears = bears * 4.10;
        double priceForMinions = minions * 8.20;
        double priceForTracks = tracks * 2;
        double profit = priceForPuzzles + priceForDolls + priceForBears+priceForMinions + priceForTracks;
        profit = profit - profit * 10 / 100;
        if (numOfToys >= 50) {
            profit  =profit -  profit * 25/100;
            double result = Math.abs(profit - tripPrice);
        if (tripPrice > profit){
            System.out.printf("Not enough money! %.2f lv needed.", result);
        }else{
            System.out.printf("Yes! %.2f lv left.", result);
        }
        }
    }
}