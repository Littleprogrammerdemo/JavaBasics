import java.util.Scanner;


public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase();
        int hours = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine().toLowerCase();

        double pricePerHour = 0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                pricePerHour = (timeOfDay.equals("day")) ? 10.50 : 8.40;
                break;
            case "june":
            case "july":
            case "august":
                pricePerHour = (timeOfDay.equals("day")) ? 12.60 : 10.20;
                break;
        }

        if (peopleCount >= 4) {
            pricePerHour *= 0.90;
        }

        double totalCost = hours * pricePerHour * peopleCount;

        if (hours >= 5) {
            totalCost *= 0.50;
            pricePerHour *= 0.50;
        }

        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f%n", totalCost);
    }
}
