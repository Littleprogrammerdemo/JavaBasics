import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int catsCount = Integer.parseInt(scanner.nextLine());

        int group1Count = 0;
        int group2Count = 0;
        int group3Count = 0;
        double foodPrice = 0;

        for (int i = 0; i < catsCount; i++) {
            double food = Double.parseDouble(scanner.nextLine());

            if (food >= 100 && food < 200) {
                group1Count++;
            } else if (food >= 200 && food < 300) {
                group2Count++;
            } else if (food >= 300 && food < 400) {
                group3Count++;
            }

            foodPrice += food;
        }

        int totalCats = group1Count + group2Count + group3Count;
        double totalPriceGrams = (foodPrice / 1000) ;
        double totalPrice = totalPriceGrams * 12.45;

        System.out.println("Group 1: " + group1Count + " cats.");
        System.out.println("Group 2: " + group2Count + " cats.");
        System.out.println("Group 3: " + group3Count + " cats.");
        System.out.printf("Price for food per day: %.2f lv.", totalPrice);
    }
}
