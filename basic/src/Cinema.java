import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int rolls = Integer.parseInt(scanner.nextLine());
        int colons = Integer.parseInt(scanner.nextLine());
        int totalSeats = rolls * colons;
        double totalIncome =0.00;
        switch (projection){
            case "Premiere":
                totalIncome = totalSeats * 12;
                break;
            case "Normal":
                totalIncome = totalSeats *7.50;
                break;
            case "Discount":
                totalIncome = totalSeats*5.00;
                break;

        }
        System.out.printf("%.2f leva",totalIncome);
    }
}
