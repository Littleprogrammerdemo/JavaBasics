import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        double costumePricePerPerson = Double.parseDouble(scanner.nextLine());
        double decor = (budget * 10)/100;
        double costumePrice = costumePricePerPerson * numOfPeople;
        if (numOfPeople>150){
            costumePrice = costumePrice - ((costumePrice* 10)/100);

        }
        double result = decor + costumePrice;
        double diff = Math.abs(budget - result);

        if(budget>= result){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }


    }
}
