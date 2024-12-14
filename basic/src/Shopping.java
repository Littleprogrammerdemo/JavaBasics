import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int cpus = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double priceForVideoCard = videoCard * 250;
        double priceForCpus = cpus * (priceForVideoCard * 35 / 100);
        double priceForRam = ram * (priceForVideoCard* 10/100);
        double totalSum = priceForVideoCard + priceForCpus + priceForRam;
        if (videoCard> cpus){
            totalSum -=  totalSum * 15/100;

        }
        double diff = Math.abs(totalSum - budget);
        if (totalSum > budget){
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }else{
            System.out.printf("You have %.2f leva left!", diff);
        }



    }
}
