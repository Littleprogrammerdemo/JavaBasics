    import java.util.Scanner;

    public class MovieDestination {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double budget = Double.parseDouble(scanner.nextLine());
            String destination = scanner.nextLine();
            String season = scanner.nextLine();
            int countDays = Integer.parseInt(scanner.nextLine());
            int dailyPrice =0;
            switch (destination){
                case "Dubai":
                    if (season.equals("Summer")){
                        dailyPrice = 40000;
                    }else {
                        dailyPrice = 45000;
                    }
                    break;
                case "Sofia":
                    if (season.equals("Summer")){
                        dailyPrice = 12500;
                    }else {
                        dailyPrice = 17000;
                    }
                    break;
                case "London":
                    if (season.equals("Summer")) {
                        dailyPrice = 20250;
                    } else {
                        dailyPrice = 24000;
                    }
                    break;
            }
            double totalSum = dailyPrice * countDays;
            if (destination.equals("Dubai")) {
                totalSum = totalSum -(totalSum *0.30);
            } else if (destination.equals("Sofia")) {
                totalSum = totalSum +(totalSum *0.25);
            }
            double diff = Math.abs(budget - totalSum);

            if (totalSum <= budget) {
                System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
            } else {
                System.out.printf("The director needs %.2f leva more!", diff);
            }
        }
    }
