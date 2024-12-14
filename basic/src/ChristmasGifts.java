import java.util.Scanner;

public class ChristmasGifts{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adultsCount = 0;
        int kidsCount = 0;
        int toysCost = 0;
        int sweatersCost = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("Christmas")) {
                break;
            }

            int age = Integer.parseInt(input);

            if (age <= 16) {
                kidsCount++;
                toysCost += 5;
            } else {
                adultsCount++;
                sweatersCost += 15;
            }
        }

        System.out.println("Number of adults: " + adultsCount);
        System.out.println("Number of kids: " + kidsCount);
        System.out.println("Money for toys: " + toysCost);
        System.out.println("Money for sweaters: " + sweatersCost);
    }
}
