import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numsOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numsOfDays = Integer.parseInt(scanner.nextLine());
        int result = numsOfPages/pagesPerHour/numsOfDays;
        System.out.println(result);
    }
}
