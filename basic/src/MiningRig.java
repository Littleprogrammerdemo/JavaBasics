import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int adapterPrice = Integer.parseInt(scanner.nextLine());
        double electricityCostPerCard = Double.parseDouble(scanner.nextLine());
        double dailyProfitPerCard = Double.parseDouble(scanner.nextLine());

        int totalVideoCardsCost = videoCardPrice * 13;
        int totalAdapterCost = adapterPrice * 13;
        int otherComponentsCost = 1000;

        int totalInvestment = totalVideoCardsCost + totalAdapterCost + otherComponentsCost;

        double totalDailyProfit = 13 * (dailyProfitPerCard - electricityCostPerCard);

        int daysToBreakEven = (int) Math.ceil((double) totalInvestment / totalDailyProfit);

        System.out.println(totalInvestment);
        System.out.println(daysToBreakEven);
    }
}