import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercentage = Integer.parseInt(scanner.nextLine());
        int proteinPercentage = Integer.parseInt(scanner.nextLine());
        int carbohydratesPercentage = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercentage = Integer.parseInt(scanner.nextLine());

        double fatGrams = (fatPercentage / 100.0) * totalCalories / 9;
        double proteinGrams = (proteinPercentage / 100.0) * totalCalories / 4;
        double carbohydratesGrams = (carbohydratesPercentage / 100.0) * totalCalories / 4;

        double totalWeight = fatGrams + proteinGrams + carbohydratesGrams;
        double waterContent = waterPercentage / 100.0;
        double caloriesPerGram = totalCalories / totalWeight * (1 - waterContent);

        System.out.printf("%.4f", caloriesPerGram);
    }
}
