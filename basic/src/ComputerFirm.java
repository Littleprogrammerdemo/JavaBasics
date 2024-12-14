    import java.util.Scanner;

    public class ComputerFirm {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int computersCount = Integer.parseInt(scanner.nextLine());
            double totalSales = 0.0;
            double totalRating = 0.0;

            for (int i = 0; i < computersCount; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                int rating = number % 10;
                int sales = (number - rating) / 10;
                totalSales += sales * 0.5;

                switch (rating) {
                    case 2:
                        totalSales += sales * 0.0  ;
                        break;
                    case 3:
                        totalSales = sales * 0.5;
                        break;
                    case 4:
                        totalSales += sales * 0.7;
                        break;
                    case 5:
                        totalSales = sales * 0.85;
                        break;
                    case 6:
                        totalSales = sales * 1.0;
                        break;

                }
                totalSales += sales;
                totalRating += rating;

            }

            double averageRating = totalRating / computersCount;
            System.out.printf("%.2f%n", totalSales);
            System.out.printf("%.2f%n", averageRating);
        }
    }