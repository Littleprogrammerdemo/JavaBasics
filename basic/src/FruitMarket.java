import java.util.Scanner;

public class FruitMarket {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaQuantity = Double.parseDouble(scanner.nextLine());
        double orangeQuantity = Double.parseDouble(scanner.nextLine());
        double raspberryQuantity = Double.parseDouble(scanner.nextLine());
        double strawberryQuantity = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice / 2;
        double orangePrice = raspberryPrice * 0.6;
        double bananaPrice = raspberryPrice * 0.2;

        double allRaspberryPrice = raspberryQuantity * raspberryPrice;
        double allBananaPrice = bananaQuantity * bananaPrice;
        double allOrangePrice = orangeQuantity * orangePrice;
        double allStrawberryPrice = strawberryQuantity * strawberryPrice;

        double totalSum = allStrawberryPrice + allBananaPrice + allOrangePrice + allRaspberryPrice;

        System.out.printf("%.2f", totalSum);
    }
}