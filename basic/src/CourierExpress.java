import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double pricePerKilometer = 0;
        double price = 0;
        double markup = 0;

        if (serviceType.equals("standard")) {
            if (weight < 1) {
                pricePerKilometer = 0.03;
            } else if (weight >= 1 && weight <= 10) {
                pricePerKilometer = 0.05;
            } else if (weight > 10 && weight <= 40) {
                pricePerKilometer = 0.10;
            } else if (weight > 40 && weight <= 90) {
                pricePerKilometer = 0.15;
            } else if (weight > 90 && weight <= 150) {
                pricePerKilometer = 0.20;
            }
            price = distance * pricePerKilometer ;
        } else if (serviceType.equals("express")) {
            if (weight < 1) {
                double pricePerKilometerWithMarkup = 0.03 * 0.8 ;
                markup = weight * pricePerKilometerWithMarkup ;
                pricePerKilometer = 0.03 ;
            } else if (weight >= 1 && weight <= 10) {
                double pricePerKilometerWithMarkup = 0.05 * 0.4 ;
                markup = weight * pricePerKilometerWithMarkup ;
                pricePerKilometer = 0.05;
            } else if (weight > 10 && weight <= 40) {
                double pricePerKilometerWithMarkup = 0.10 * 0.05 ;
                markup = weight * pricePerKilometerWithMarkup ;
                pricePerKilometer = 0.10;
            } else if (weight > 40 && weight <= 90) {
                double pricePerKilometerWithMarkup = 0.15 * 0.02;
                markup = weight * pricePerKilometerWithMarkup ;
                pricePerKilometer = 0.15;
            } else if (weight > 90 && weight <= 150) {
                double pricePerKilometerWithMarkup = 0.20 * 0.01 ;
                markup = weight * pricePerKilometerWithMarkup ;
                pricePerKilometer = 0.20;
            }
            double priceWithMarkup = distance * markup;
            price += distance * pricePerKilometer + priceWithMarkup;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, price);
    }
}
