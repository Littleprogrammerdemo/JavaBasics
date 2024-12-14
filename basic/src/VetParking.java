import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.00;
        for (int day = 1; day <= days; day++) {
            double dayPrice = 0.00;
            for (int hour = 1; hour <= hours; hour++) {
                if (day % 2 == 0 && hour % 2 != 0) {
                    dayPrice += 2.50;

                }
                else if (day % 2 != 0 && hour % 2 == 0) {
                    dayPrice += 1.25;
                }else {
                    dayPrice += 1.00;
                }
            }
            totalPrice += dayPrice;
            System.out.printf("Day: %d - %.2f leva%n", day, dayPrice);
            }
        System.out.printf("Total: %.2f leva", totalPrice);
        }
}
