import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());
        double apartmentPrice = 0.00;
        double studioPrice = 0.00;
        switch (month) {
            case "May":
            case "October":
                apartmentPrice = 65.00 * overnights;
                studioPrice = 50.00 * overnights;
                break;
            case "June":
            case "September":
                apartmentPrice = 68.70 * overnights;
                studioPrice = 75.20 * overnights;

                break;
            case "July":
            case "August":
                apartmentPrice = 77.00 * overnights;
                studioPrice = 76.00 * overnights;
                break;
        }
            if ((month.equals("May") || month.equals("October")) && (overnights < 14 && overnights > 7)) {
                studioPrice *= 0.95;
            } else if ((month.equals("May") || month.equals("October")) && overnights > 14) {
                studioPrice *= 0.70;
            } else if ((month.equals("June") || month.equals("September")) && overnights > 14) {
                studioPrice *= 0.80;
            }
            if (overnights > 14) {
                apartmentPrice *= 0.90;
            }
        System.out.printf("Apartment: %.02f lv.%n", apartmentPrice);
            System.out.printf("Studio: %.02f lv.", studioPrice);


        }
    }


