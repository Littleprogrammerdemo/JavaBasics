import java.util.Scanner;

public class TennisEquipment {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRacketCount = Integer.parseInt(scanner.nextLine());
        int trainers = Integer.parseInt(scanner.nextLine());
        double allTennisRacketPrice = tennisRacketCount*tennisRacketPrice;
        double trainersPrice = tennisRacketPrice/6;
        double priceForAllTrainers = trainers * trainersPrice;
        double remainingEquipment =(allTennisRacketPrice+priceForAllTrainers)*0.2;
        double totalSum = allTennisRacketPrice+priceForAllTrainers+remainingEquipment;
        double priceForDjokovic = totalSum/8;
        double priceForSponsors = totalSum *7/8;

        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(priceForDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f%n",Math.ceil(priceForSponsors));


    }
}
